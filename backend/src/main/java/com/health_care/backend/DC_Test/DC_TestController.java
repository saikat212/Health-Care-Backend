package com.health_care.backend.DC_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DC_TestController {
    @Autowired
    private DC_TestService service;

    @PostMapping("/saveDc-test")
    public DC_Test sDc_Test(DC_Test dc_Test){
        return service.saveDc_Test(dc_Test);
    }
}
