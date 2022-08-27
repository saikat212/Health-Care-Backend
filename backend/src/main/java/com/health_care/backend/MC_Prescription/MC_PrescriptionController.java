package com.health_care.backend.MC_Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MC_PrescriptionController {
    @Autowired
    private MC_PrescriptionService service;

    @PostMapping("/save-medicine-pres")
    public void saveMedicine(@RequestBody MC_Prescription[] p){
        for(int i=0;i<p.length;i++){
         service.saveMedicine(p[i]);
        }
    }

    @GetMapping("/get-medicine-in-prescription/{id}")
    public List<MC_Prescription> getAllMedicine(@PathVariable Integer id){
        return service.getPrescriptionById(id);
    }
}
