package com.health_care.backend.DCTestList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DCTestListService {
    @Autowired
    private DCTestListRepository repository;

    public DCTestList saveDc_Test(DCTestList dc_Test) {
        return repository.save(dc_Test);
    }
    public List<DCTestList> getAllDCTestList() { return  repository.findAll();}

    public List<DCTestList> getDCByTestname(@PathVariable String testname) { return  repository.findDCByTestname(testname);}
}
