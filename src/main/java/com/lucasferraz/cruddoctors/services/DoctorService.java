package com.lucasferraz.cruddoctors.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasferraz.cruddoctors.DTO.DoctorDTO;
import com.lucasferraz.cruddoctors.entities.Doctor;
import com.lucasferraz.cruddoctors.repositories.DoctorRepository;
import com.lucasferraz.cruddoctors.services.exceptions.EntityNotFoundException;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	@Transactional(readOnly = true)
	public List<DoctorDTO> findAll(){
		List<Doctor> list = repository.findAll();
		return list.stream().map(x -> new DoctorDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public DoctorDTO findById(Integer id) {
		Optional<Doctor> obj = repository.findById(id);
		Doctor entity = obj.orElseThrow(() -> new EntityNotFoundException("Médico não encontrado"));
		return new DoctorDTO(entity);
	}

}
