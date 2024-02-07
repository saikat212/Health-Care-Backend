package com.health_care.backend.Prescription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrescriptionController {
    @Autowired
    private PrescriptionService service;

    @PostMapping("/save-prescription")
    public Prescription savePrescription(@RequestBody Prescription p){
        System.out.println(p);
        return service.savePrescription(p);
    }
}
