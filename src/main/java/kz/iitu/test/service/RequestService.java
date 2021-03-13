package kz.iitu.test.service;

import kz.iitu.test.entity.Medicines;
import kz.iitu.test.entity.Requests;

import java.util.List;

public interface RequestService {
    void create(Requests requests);
    void update(Long id, Requests requests);
    void delete(Long id, Requests requests);
    void makeRequest(String name, String manufacturer, Long quantity);
    List<Requests> findAll();
}
