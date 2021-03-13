package kz.iitu.test.event;

import kz.iitu.test.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AcceptRequestEventHandler implements ApplicationListener<AcceptRequestEvent> {

    @Override
    @EventListener
    public void onApplicationEvent(AcceptRequestEvent acceptRequestEvent) {
        acceptRequestEvent.medicineService.acceptAll();
    }
}
