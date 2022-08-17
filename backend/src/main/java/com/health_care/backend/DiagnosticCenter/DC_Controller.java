package com.health_care.backend.DiagnosticCenter;

import com.health_care.backend.DC_Test.DC_Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get-dc-by-admin-id/{id}")
    public DiagnosticCenter getDCByAdminId(@PathVariable Integer id) { return  service.getDCByAdminId(id);}


}
