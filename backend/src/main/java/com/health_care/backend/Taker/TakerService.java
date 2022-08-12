package com.health_care.backend.Taker;

import com.health_care.backend.Person.PersonRepository;
import com.health_care.backend.TakerSpeciality.TakerSpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TakerService {

    @Autowired
    private TakerRepository repository;
    private PersonRepository personRepository;
    public Taker saveTaker(Taker taker) {return repository.save(taker);}
    public Taker findTakerById(int id) {return repository.findById(id).orElse(null);}
}
