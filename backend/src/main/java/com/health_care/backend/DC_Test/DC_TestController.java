package com.health_care.backend.DC_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DC_TestController {
    @Autowired
    private DC_TestService service;

    @PostMapping("/addDCTest")
    public DC_Test sDc_Test(@RequestBody DC_Test dc_Test){
        return service.saveDc_Test(dc_Test);
    }

    @GetMapping("/get-all-request")
    public List<DC_Test> getAllRequest() {return service.getAllRequest();}

    @GetMapping("/get-pending-request")
    public List<DC_Test> getPendingRequest(){return service.getPendingRequest();}


    @GetMapping("/get-confirmed-request/{id}")
    public List<DC_Test> getConfirmedRequest(@PathVariable Integer id) {

        System.out.println(id);
        return service.getConfirmedRequest(id);
    }

    @GetMapping("/get-submitted-request/{id}")
    public List<DC_Test> getSubmittedRequest(@PathVariable Integer id) { return service.getSubmittedRequest(id);}
    @GetMapping("/get-offsite-pending")
    public List<DC_Test> getOffsitePending(){return service.getOffsitePending();}


    }


