package com.health_care.backend.DCTestList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DCTestListService {
    @Autowired
    private DCTestListRepository repository;

    public DCTestList saveDc_Test(DCTestList dc_Test) {
        return repository.save(dc_Test);
    }

}
