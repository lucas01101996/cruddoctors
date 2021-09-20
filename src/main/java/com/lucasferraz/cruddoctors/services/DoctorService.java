package com.lucasferraz.cruddoctors.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasferraz.cruddoctors.entities.Doctor;
import com.lucasferraz.cruddoctors.repositories.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	public List<Doctor> findAll(){
		return repository.findAll();
	}

}
