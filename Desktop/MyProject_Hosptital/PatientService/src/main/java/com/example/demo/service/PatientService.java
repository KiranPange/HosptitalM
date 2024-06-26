package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);

	List<Patient> getAllPatients();

	Patient getPatientById(int patientId);

	Patient updatePatient(Patient patient, int patientId);

	String deletePatientById(int patientId);

}
