package com.health_care.backend.Medicine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
    @Autowired
    private MedicineService service;

    @GetMapping("/get-all-medicine")
    public List<Medicine> getAllMedicine()
    {
        return service.getAllMedicine();
    }
}
