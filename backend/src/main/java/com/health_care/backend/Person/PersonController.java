package com.health_care.backend.Person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@CrossOrigin
public class PersonController {
    
    @Autowired
    private PersonService service;

    @PostMapping("/authenticate-user")
    public ObjectNode authenticateUser(@RequestBody Map<String,String> userMap){
        String email = userMap.get("email");
        String password = userMap.get("password");

        return service.authenticatePerson(email, password);
    }

    
    


}
