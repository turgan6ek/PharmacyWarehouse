package kz.iitu.test.event;

import kz.iitu.test.entity.Medicines;
import kz.iitu.test.entity.Requests;
import kz.iitu.test.service.MedicineService;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class AcceptRequestEvent extends ApplicationEvent {
   MedicineService medicineService;
    public AcceptRequestEvent(Object source, MedicineService medicineService) {
        super(source);
        this.medicineService = medicineService;
    }
}
