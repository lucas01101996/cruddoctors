package com.lucasferraz.cruddoctors.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasferraz.cruddoctors.DTO.DoctorDTO;
import com.lucasferraz.cruddoctors.entities.Doctor;
import com.lucasferraz.cruddoctors.repositories.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	@Transactional(readOnly = true)
	public List<DoctorDTO> findAll(){
		List<Doctor> list = repository.findAll();
		return list.stream().map(x -> new DoctorDTO(x)).collect(Collectors.toList());
	}

}
