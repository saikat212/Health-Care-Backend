package com.health_care.backend.MC_Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MC_PrescriptionController {
    @Autowired
    private MC_PrescriptionService service;

    @PostMapping("/save-medicine")
    public MC_Prescription saveMedicine(@RequestBody MC_Prescription p){
        return service.saveMedicine(p);
    }

    @GetMapping("get-all-medicine-in-prescription")
    public List<MC_Prescription> getAllMedicine(){
        return service.getAll();
    }
}
