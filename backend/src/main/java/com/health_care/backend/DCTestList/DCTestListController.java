package com.health_care.backend.DCTestList;

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

}
