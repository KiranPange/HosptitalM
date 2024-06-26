package com.example.demo.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientService;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	public Patient getPatientById(int patientId) {
		return patientRepository.findById(patientId).orElseThrow();
	}

	public Patient updatePatient(Patient patient, int patientId) {
		Patient existingPatient = patientRepository.findById(patientId).orElseThrow();
		existingPatient.setFirstName(patient.getFirstName());
		existingPatient.setLastName(patient.getLastName());
		existingPatient.setEmail(patient.getEmail());
		existingPatient.setPhoneNumber(patient.getPhoneNumber());
		// Additional fields to update as needed
		return patientRepository.save(existingPatient);
	}

	public String deletePatientById(int patientId) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(patientId);
		return "Deleted Patient by ID" + patientId;

	}

}
