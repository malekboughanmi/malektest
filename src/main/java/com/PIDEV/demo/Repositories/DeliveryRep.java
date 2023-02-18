package com.PIDEV.demo.Repositories;


import com.PIDEV.demo.Entities.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRep extends CrudRepository<Delivery,Integer> {
}
