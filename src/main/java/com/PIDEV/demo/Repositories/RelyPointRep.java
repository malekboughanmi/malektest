package com.PIDEV.demo.Repositories;





import com.PIDEV.demo.Entities.Reaction;
import com.PIDEV.demo.Entities.RelyPoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelyPointRep extends CrudRepository<RelyPoint,Integer> {
}
