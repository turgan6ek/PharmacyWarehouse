package kz.iitu.test.service.impl;

import kz.iitu.test.dao.MedicineDao;
import kz.iitu.test.dao.RequestDao;
import kz.iitu.test.entity.Medicines;
import kz.iitu.test.entity.Requests;
import kz.iitu.test.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private MedicineDao medicineDao;
    @Autowired
    private RequestDao requestDao;
    Scanner scan = new Scanner(System.in);

    @Override
    public void create(Requests requests) {
        requestDao.save(requests);
    }

    @Override
    public void update(Long id, Requests requests) {

    }

    @Override
    public void delete(Long id, Requests requests) {
        requestDao.deleteById(id);
    }

    @Override
    public void makeRequest(String name, String manufacturer,Long quantity) {
        Requests requests = new Requests(name, manufacturer, quantity);
        requestDao.save(requests);
    }

    @Override
    public List<Requests> findAll() {
         return requestDao.findAll();
    }
}
