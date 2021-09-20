package com.lucasferraz.cruddoctors.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasferraz.cruddoctors.entities.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor ,Integer >{
 
}
