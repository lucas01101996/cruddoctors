package com.lucasferraz.cruddoctors.DTO;

import java.io.Serializable;

import com.lucasferraz.cruddoctors.entities.Specialty;

public class SpecialtyDTO implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public SpecialtyDTO() {
	}

	public SpecialtyDTO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SpecialtyDTO(Specialty entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
