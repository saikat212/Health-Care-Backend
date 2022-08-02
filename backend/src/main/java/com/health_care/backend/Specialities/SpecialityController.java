package com.health_care.backend.Specialities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialityController {
    @Autowired
    SpecialityService service;

    @GetMapping("/get-all-specialities")
    public List<Speciality> getAllSpeciality() {
        return service.getAllSpeciality();
    }
}
