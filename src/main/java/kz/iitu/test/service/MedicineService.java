package kz.iitu.test.service;

import kz.iitu.test.entity.Medicines;
import kz.iitu.test.entity.Requests;

import java.util.List;

public interface MedicineService {
    void create(Medicines medicines);
    void update(Long id, Medicines medicines);
    void delete(Long id, Medicines medicines);
    void acceptReq(Requests requests);
    void getMedicines();
    void acceptAll();
    List<Medicines> findAll();
}
