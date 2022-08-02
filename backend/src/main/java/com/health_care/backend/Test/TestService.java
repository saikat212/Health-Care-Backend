package com.health_care.backend.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository repository;

    public Test saveTest(Test test){
       return repository.save(test);
    }
}
