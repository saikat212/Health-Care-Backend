package com.health_care.backend.TakerSpeciality;

import com.health_care.backend.Specialities.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakerSpecialityService {
    @Autowired
    TakerSpecialityRepository repository;

    public List<TakerSpeciality> getAllTakerSpeciality() {return repository.findAll();}
}
