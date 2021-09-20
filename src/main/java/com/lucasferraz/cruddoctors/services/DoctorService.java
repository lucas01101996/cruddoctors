package com.lucasferraz.cruddoctors.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasferraz.cruddoctors.repositories.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	

}
