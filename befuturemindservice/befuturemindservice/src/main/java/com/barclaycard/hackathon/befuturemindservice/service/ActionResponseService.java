package com.barclaycard.hackathon.befuturemindservice.service;

import com.barclaycard.hackathon.befuturemindservice.repository.ActionResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ActionResponseService {

    @Autowired
    ActionResponseRepository repository;

    public Integer getCount() {
        return repository.getCount();
    }

    public Integer setCount(int count) {
        repository.saveCount(count);
        return null;
    }
}
