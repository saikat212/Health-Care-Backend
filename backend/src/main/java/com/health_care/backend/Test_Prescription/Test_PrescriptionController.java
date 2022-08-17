package com.health_care.backend.Test_Prescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_PrescriptionController {
    @Autowired

    private Test_PrescriptionService service;

    @PostMapping("/save-test-pres")
    public void saveTest(@RequestBody Test_Prescription[] t){
        for(int i=0;i<t.length;i++){
            System.out.println("tttttt: "+t[i]);
         service.saveTest(t[i]);
        }
    }
    @GetMapping("/get-all-test-in-prescription")
    public List<Test_Prescription> getAllTest(){
        return service.getAllTest();
    }
}
