package kz.iitu.test.controller;

import kz.iitu.test.entity.Medicines;
import kz.iitu.test.entity.Requests;
import kz.iitu.test.service.MedicineService;
import kz.iitu.test.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.sql.SQLOutput;
import java.util.Scanner;
@Controller
public class WarehouseSystem {
    @Autowired
    private MedicineService medicineService;
    @Autowired
    private RequestService requestService;

    Scanner scan = new Scanner(System.in);

    @PostConstruct
   void showMenu() {
        System.out.println("1.Warehouse side");
        System.out.println("2.Pharmacy side");
        System.out.println("3.Exit");
        int choice = scan.nextInt();
        while (choice != 3) {
            switch (choice) {
                case 1: {
                    showWarehouseMenu();
                    break;
                }
                case 2: {
                    showPharmacyMenu();
                    break;
                }
                case 3: {
                    System.out.println("Good Bye");
                    break;
                }
                default:
                {
                    System.out.println("Wrong input.");
                }
            }
        }

    }
    void showWarehouseMenu(){
        System.out.println("1.Get medicines");
        System.out.println("2.Set goal");
        System.out.println("3.List of requests");
        System.out.println("4.Back");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                medicineService.getMedicines();
                break;
            }
            case 2: {
                System.out.println("Enter the goal: ");

                break;
            }
            case 3: {
                if (medicineService.findAll().size() == 0) {
                    System.out.println("There is no requests for now.");
                }
                else {
                    for (Requests req: requestService.findAll()) {
                        System.out.println(req.getId() + " - " + req.getName() + " - " + req.getManufacturer() +
                                " - " + req.getQuantity());
                    }
                }
                break;
            }
            case 4: {
                this.showMenu();
                break;
            }
            default:
            {
                System.out.println("Wrong input.");
            }
        }
    }
    void showPharmacyMenu() {
        System.out.println("1.Make request");
        System.out.println("2.List of medicines");
        System.out.println("3.Back");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the name: ");
                String name = scan.next();
                System.out.println("Enter the manufacturer: ");
                String manufacturer = scan.next();
                System.out.println("How many drugs do you want to receive: ");
                Long quantity = scan.nextLong();
                requestService.makeRequest(name, manufacturer, quantity);
                break;
            }
            case 2: {
                if (requestService.findAll().size() == 0) {
                    System.out.println("The warehouse is empty for now.");
                }
                else {

                }
                break;
            }
            case 3: {
                this.showMenu();
                break;
            }
            default:
            {
                System.out.println("Wrong input.");
            }
        }
    }
}
