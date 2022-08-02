package com.health_care.backend.DiagnosticCenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DC_Controller {
    @Autowired
    private DC_Service service;

    @PostMapping("/save-dc")
    public DiagnosticCenter saveDC(@RequestBody DiagnosticCenter dc){
        return service.saveDC(dc);
    }
}
