package com.lucasferraz.cruddoctors.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasferraz.cruddoctors.DTO.DoctorDTO;
import com.lucasferraz.cruddoctors.services.DoctorService;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorResource {
	
	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<List<DoctorDTO>> findAll(){
		List<DoctorDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<DoctorDTO> findById(@PathVariable Integer id){
		DoctorDTO  dto= service.findById(id);
		return ResponseEntity.ok(dto);
		
	}

}
