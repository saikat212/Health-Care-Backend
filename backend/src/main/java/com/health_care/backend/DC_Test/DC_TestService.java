package com.health_care.backend.DC_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DC_TestService {
    @Autowired
    private DC_TestRepository repository;


    public DC_Test saveDc_Test(DC_Test dc_Test){
        return repository.save(dc_Test);
    }

    public List<DC_Test> getAllRequest() {
        return repository.findAll();

    }
    public List<DC_Test> getPendingRequest() {return  repository.findPendingRequest();}

    public List<DC_Test> getConfirmedRequest(Integer id) {return repository.findConfirmedRequest(id);}

    public List<DC_Test> getCompletedService(Integer id) {return repository.getCompletedService(id);}

    public List<DC_Test> getLabReport(Integer id) {return repository.getLabReport(id);}

    public List<DC_Test> getSubmittedRequest(Integer id) {return repository.findSubmittedRequest(id);}
    public List<DC_Test> getPendingACK(Integer id) {return repository.getPendingACK(id);}

    public List<DC_Test> getOffsitePending() {return repository.findOffsitePending();}

}



