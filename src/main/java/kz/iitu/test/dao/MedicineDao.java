package kz.iitu.test.dao;

import kz.iitu.test.entity.Medicines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineDao extends JpaRepository<Medicines, Long> {
    List<Medicines> findAll();
    Medicines findByNameAndManufacturer(String name, String manufacturer);
    boolean existsByNameAndManufacturer(String name, String manufacturer);
    boolean existsByName(String name);

}
