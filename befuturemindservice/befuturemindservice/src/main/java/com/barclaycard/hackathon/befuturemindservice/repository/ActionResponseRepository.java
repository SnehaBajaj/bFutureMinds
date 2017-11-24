package com.barclaycard.hackathon.befuturemindservice.repository;

import com.barclaycard.hackathon.befuturemindservice.entities.ActionResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionResponseRepository extends CrudRepository<ActionResponse, String>{

    Integer getCount();

    Integer saveCount(int count);

}
