package kz.iitu.test.service.impl;

import kz.iitu.test.dao.MedicineDao;
import kz.iitu.test.dao.RequestDao;
import kz.iitu.test.entity.Goal;
import kz.iitu.test.entity.Medicines;
import kz.iitu.test.entity.Requests;
import kz.iitu.test.event.AcceptRequestEvent;
import kz.iitu.test.event.GoalEvent;
import kz.iitu.test.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class MedicServiceImpl implements MedicineService, ApplicationEventPublisherAware {

    @Autowired
    private MedicineDao medicineDao;
    @Autowired
    private RequestDao requestDao;
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    @Autowired
    Goal goal;
    Scanner scan = new Scanner(System.in);
    @Override
    public void create(Medicines medicines) {
        medicineDao.save(medicines);
    }

    @Override
    public void update(Long id, Medicines medicines) {

    }

    @Override
    public void delete(Long id, Medicines medicines) {
        medicineDao.deleteById(id);
    }

    @Override
    public void acceptReq(Requests requests) {
        Optional<Medicines> medicinesOptional = Optional.ofNullable(medicineDao.findByNameAndManufacturer(requests.getName(), requests.getManufacturer()));
        if (medicinesOptional.isPresent()) {
            Medicines medicines = medicinesOptional.get();
            if (medicines.getQuantity() >= requests.getQuantity()) {
                medicines.setQuantity(medicines.getQuantity() - requests.getQuantity());
                System.out.println("The request with ID: " + requests.getId() + " is accepted for " + requests.getQuantity() * medicines.getPrice() + " tenges");
                medicineDao.save(medicines);
                requestDao.deleteById(requests.getId());
                goal.setAccepted(goal.getAccepted() + requests.getQuantity());
            }
            else {
                System.out.println("There is only " + medicines.getQuantity() + " amount of " + medicines.getName() + " left in warehouse, so the request will be accepted later.");
            }
            eventPublisher.publishEvent(new GoalEvent(this, goal));
        }

    }
    @Override
    public void getMedicines() {
        System.out.println("Enter the name: ");
        String name = scan.next();
        System.out.println("Enter the manufacturer: ");
        String manufacturer = scan.next();
        System.out.println("Enter the price of each medicine: ");
        Double price = scan.nextDouble();
        System.out.println("Enter the quantity: ");
        Long quantity = scan.nextLong();

        if (medicineDao.existsByNameAndManufacturer(name, manufacturer)) {
            System.out.println("Such medicine is exists in a DB so price won't change!!!");
            Medicines medicines = medicineDao.findByNameAndManufacturer(name, manufacturer);
            medicines.setQuantity(medicines.getQuantity() + quantity);
            System.out.println("The amount of " + medicines.getName() + " by " + manufacturer + " is " + medicines.getQuantity());
            medicineDao.save(medicines);
        }
        else {
            Medicines newMed = new Medicines(name, manufacturer, quantity, price);
            System.out.println("Medicines are received.");
            medicineDao.save(newMed);
        }
        this.eventPublisher.publishEvent(new AcceptRequestEvent(this, this));
    }

    @Override
    public void acceptAll() {
        List<Medicines> medicinesList = medicineDao.findAll();
        List<Requests> requestsList = requestDao.findAll();
        for (Requests req : requestsList) {
            if (medicineDao.existsByNameAndManufacturer(req.getName(), req.getManufacturer())) {
                this.acceptReq(req);
            }
        }
        this.eventPublisher.publishEvent(new GoalEvent(this, new Goal()));
        System.out.println("Requests are up-to-date.");
    }

    @Override
    public List<Medicines> findAll() {
        return medicineDao.findAll();
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

}
