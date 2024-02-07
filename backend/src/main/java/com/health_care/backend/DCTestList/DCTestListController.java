package com.health_care.backend.DCTestList;

import com.health_care.backend.DiagnosticCenter.DiagnosticCenter;
import com.health_care.backend.Doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DCTestListController {
    @Autowired
    private DCTestListService service;

    @PostMapping("/addDCTestList")
    public DCTestList sDc_Test(@RequestBody DCTestList dc_Test) {
        return service.saveDc_Test(dc_Test);
    }
    @GetMapping("/get-all-dc-test-list")
    public List<DCTestList> getAllDCTestList() { return  service.getAllDCTestList();}

    @GetMapping("/get-dc-by-testname/{testname}")
    public List<DCTestList> getDCByTestname(@PathVariable String testname) { return  service.getDCByTestname(testname);}


    @GetMapping("/get-test-list-by-dc-id/{id}")
    public List<DCTestList> getTestListByDCId(@PathVariable Integer id) { return  service.getTestListByDCId(id);}



//
//    @GetMapping("/search-doctor/{query}")
//    public Doctor[] searchDoctors(@PathVariable String query){
//        return service.searchDoctors(query);
//    }






}
