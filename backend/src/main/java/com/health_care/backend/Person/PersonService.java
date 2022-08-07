package com.health_care.backend.Person;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FastByteArrayOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;
    @Autowired
    private ObjectMapper mapper;

    public Person saveUser(Person user){
        return repository.save(user);
    }
    public Person findPersonById(int id){
        return repository.findById(id).orElse(null);
    }
    public Person getPersonByFirstName(String name) {
        return repository.findByFirstName(name);
    }
    public Person getPersonByLastName(String name) {
        return repository.findByLastName(name);
    }
    public Person getPersonByEmail(String email){
        return repository.findByEmail(email);
    }

    public ObjectNode authenticatePerson(String email,String password){
       ObjectNode node = mapper.createObjectNode();

       Person p = getPersonByEmail(email);

       if(p == null)
            return node
                       .put("success",false)
                       .put("message","User not found. Register first");

        else if(!password.equals(p.getPassword()))
            return node
                       .put("success",false)
                       .put("message","Password doesn't match");
        else if(password.equals(p.getPassword()))
            return node
                       .put("success",true)
                       .put("message","Login successful");
        else 
            return node 
                        .put("success",false)
                        .put("message","Server error. Try again");
    }
    
    


}
