package com.example.patient_backend.controller;

import com.example.patient_backend.dao.Patientdao;
import com.example.patient_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Patientcontroller {

    @Autowired
    private Patientdao da;
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Patient>view() {return(List<Patient>)da.findAll(); }

    @CrossOrigin (origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Patient addpatient(@RequestBody Patient p){
        System.out.println(p.getPatientname());
        System.out.println(p.getPhnum());
        System.out.println(p.getDocname());
       da.save(p);
       return p;
    }


}
