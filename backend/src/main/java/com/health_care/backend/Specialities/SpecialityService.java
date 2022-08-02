package com.health_care.backend.Specialities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {
    @Autowired
    SpecialityRepository repository;

    public List<Speciality> getAllSpeciality() {
        return repository.findAll();
    }
}
