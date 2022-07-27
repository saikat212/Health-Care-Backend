package com.health_care.backend.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer>{

    Person findByFirstName(String name);

    Person findByLastName(String name);

    Person findByEmail(String email);

    
    
}
