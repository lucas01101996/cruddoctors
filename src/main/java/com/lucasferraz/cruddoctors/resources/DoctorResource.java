package com.lucasferraz.cruddoctors.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasferraz.cruddoctors.entities.Doctor;
import com.lucasferraz.cruddoctors.services.DoctorService;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorResource {
	
	@Autowired
	private DoctorService service;
	
	@GetMapping
	public ResponseEntity<List<Doctor>> findAll(){
		List<Doctor> list = service.findAll();
		return ResponseEntity.ok(list);
	}

}
