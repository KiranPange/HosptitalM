package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Doctor;

public interface DoctorService {
	List<Doctor> getAllDoctors();
   public Doctor getDoctorById(Long id);
   public Doctor saveDoctor(Doctor doctor);
   public Doctor updateDoctor(Long id, Doctor updatedDoctor);
   public void deleteDoctor(Long id);
   


    
}
