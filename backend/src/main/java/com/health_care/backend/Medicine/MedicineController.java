package com.health_care.backend.Medicine;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
    private MedicineService service;

    @PostMapping("/get-all-medicine")
    public List<Medicine> getAllMedicine()
    {
        return service.getAllMedicine();
    }
}
