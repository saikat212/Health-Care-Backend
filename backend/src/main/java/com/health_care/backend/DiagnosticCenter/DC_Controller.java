package com.health_care.backend.DiagnosticCenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DC_Controller {
    @Autowired
    private DC_Service service;

    @PostMapping("/addDC")
    public DiagnosticCenter saveDC(@RequestBody DiagnosticCenter dc){
        return service.saveDC(dc);
    }

    @GetMapping("/get-all-dc-list")
    public List<DiagnosticCenter> getAllDCList() { return  service.getAllDCList();}
}
