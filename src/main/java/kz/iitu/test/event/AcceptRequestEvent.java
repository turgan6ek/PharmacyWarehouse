package kz.iitu.test.event;

import kz.iitu.test.service.MedicineService;
import org.springframework.context.ApplicationEvent;

public class AcceptRequestEvent extends ApplicationEvent {
   MedicineService medicineService;
    public AcceptRequestEvent(Object source, MedicineService medicineService) {
        super(source);
        this.medicineService = medicineService;
    }
}
