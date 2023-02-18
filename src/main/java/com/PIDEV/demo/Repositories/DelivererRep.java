package com.PIDEV.demo.Repositories;


import com.PIDEV.demo.Entities.Deliverer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DelivererRep extends CrudRepository<Deliverer,Integer> {
}
