package com.health_care.backend.DC_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DC_TestController {
    @Autowired
    private DC_TestService service;

    @PostMapping("/saveDc-test")
    public DC_Test sDc_Test(DC_Test dc_Test){
        return service.saveDc_Test(dc_Test);
    }

    @GetMapping("/get-all-request")
    public List<DC_Test> getAllRequest() {return service.getAllRequest();}

    @GetMapping("/get-pending-request")
    public List<DC_Test> getPendingRequest(){return service.getPendingRequest();}
}
