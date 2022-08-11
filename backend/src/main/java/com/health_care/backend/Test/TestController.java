package com.health_care.backend.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService service;

    @PostMapping("/save-test")
    public Test saveTest(@RequestBody Test test){
        return service.saveTest(test);
    }
    @GetMapping("/get-all-test")
    public List<Test> getAllTest(){
        return service.getAllTest();
    }
}
