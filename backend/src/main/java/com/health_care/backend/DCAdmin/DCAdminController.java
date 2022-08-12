package com.health_care.backend.DCAdmin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DCAdminController {

    @Autowired
    private DCAdminService service;

    @PostMapping("/addDCAdmin")
    public DCAdmin addDCAdmin(@RequestBody DCAdmin admin)
    {
        return service.addDCAdmin(admin);
    }
}
