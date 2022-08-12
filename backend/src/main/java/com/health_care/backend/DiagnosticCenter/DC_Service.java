package com.health_care.backend.DiagnosticCenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DC_Service {
    @Autowired
    private DiagnosticCenerRepository repository;

    public DiagnosticCenter saveDC(DiagnosticCenter dc){
        return repository.save(dc);
    }
    public List<DiagnosticCenter> getAllDCList() { return  repository.findAll();}
}
