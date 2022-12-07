package com.example.patient_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue
    private int id;
    private String patientname;
    private String phnum;
    private String docname;

    public Patient() {
    }

    public Patient(int id, String patientname, String phnum, String docname) {
        this.id = id;
        this.patientname = patientname;
        this.phnum = phnum;
        this.docname = docname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPhnum() {
        return phnum;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }
}
