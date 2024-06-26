package com.example.demo.controller;

import com.example.demo.service.PatientService;
import com.example.demo.model.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients") // Base URL mapping for the controller
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/create")
    public Patient createPatient(@RequestBody Patient patient) {
       return patientService.savePatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {
         return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable("id") int patientId) {
        return patientService.getPatientById(patientId);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable("id") int patientId, @RequestBody Patient patient) {
        return patientService.updatePatient(patient, patientId);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable("id") int patientId) {
        return patientService.deletePatientById(patientId);
    }
}
