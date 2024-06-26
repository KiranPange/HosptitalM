package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Doctor;
import com.example.demo.Repostiory.DoctorRepository;
import com.example.demo.Service.DoctorService;

public class DoctorServiceImpl implements DoctorService {

	@Autowired
    private DoctorRepository doctorRepository;

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(Long id) {
		Optional<Doctor> optionalDoctor = doctorRepository.findById(id);
        return optionalDoctor.orElse(null);
	}

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	@Override
	public Doctor updateDoctor(Long id, Doctor updatedDoctor) {
		Optional<Doctor> optionalExistingDoctor = doctorRepository.findById(id);
        if (optionalExistingDoctor.isPresent()) {
            Doctor existingDoctor = optionalExistingDoctor.get();
            existingDoctor.setName(updatedDoctor.getName());
            existingDoctor.setSpecialization(updatedDoctor.getSpecialization());
            existingDoctor.setDetails(updatedDoctor.getDetails());
            return doctorRepository.save(existingDoctor);
        }
        return null;
    }
	@Override
	public void deleteDoctor(Long id) {
      doctorRepository.deleteById(id);	
	}
	

}
