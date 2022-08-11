package com.health_care.backend.Taker;


import com.health_care.backend.Person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class TakerController {
    @Autowired
    private TakerService service;
    private PersonService personService;

    @PostMapping("/addTaker")
    public Taker addTaker(@RequestBody Taker taker)
    {

        System.out.println(taker);
        return service.saveTaker(taker);
    }
    @GetMapping("/taker-id/{id}")

    public  Taker getTakerById(@PathVariable int id) { return service.findTakerById(id);}


}
