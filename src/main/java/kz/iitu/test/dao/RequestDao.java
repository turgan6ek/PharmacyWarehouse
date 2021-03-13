package kz.iitu.test.dao;

import kz.iitu.test.entity.Requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestDao extends JpaRepository<Requests, Long> {
    List<Requests> findAll();
}
