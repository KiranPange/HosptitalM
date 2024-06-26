package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

@Id   
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String city;
    
    //mapping
    private int  doctorId;
    private int appointmentId;
    // Additional fields as needed

    // Constructors, getters, and setters

    public Patient() {
        // Default constructor required by JPA
    }

    public Patient(String firstName, String lastName, String email, String phoneNumber, int doctorId,int appointmentId ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.doctorId=doctorId;
        this.appointmentId=appointmentId;
    }

    // Getters and setters

    public int getId() {
        return patientId;
    }

    public void setId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

    // Additional methods if needed
}
