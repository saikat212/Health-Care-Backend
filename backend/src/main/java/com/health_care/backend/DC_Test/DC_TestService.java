package com.health_care.backend.DC_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DC_TestService {
    @Autowired
    private DC_TestRepository repository;

    public DC_Test saveDc_Test(DC_Test dc_Test){
        return repository.save(dc_Test);
    }
}
