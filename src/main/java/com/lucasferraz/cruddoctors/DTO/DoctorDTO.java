package com.lucasferraz.cruddoctors.DTO;

import java.io.Serializable;

import com.lucasferraz.cruddoctors.entities.Doctor;
import com.lucasferraz.cruddoctors.enums.MedicalSpecialty;

public class DoctorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String crm;
	private Integer landilinePhone;
	private Integer mobilePhone;
	private Integer cep;
	private MedicalSpecialty medicalSpecialty;
	
	public DoctorDTO() {
	}

	public DoctorDTO(Integer id, String name, String crm, Integer landilinePhone, Integer mobilePhone, Integer cep,
			MedicalSpecialty medicalSpecialty) {
		this.id = id;
		this.name = name;
		this.crm = crm;
		this.landilinePhone = landilinePhone;
		this.mobilePhone = mobilePhone;
		this.cep = cep;
		this.medicalSpecialty = medicalSpecialty;
	}

	public DoctorDTO(Doctor entity) {
		id = entity.getId();
		name = entity.getName();
		crm = entity.getCrm();
		landilinePhone = entity.getLandilinePhone();
		mobilePhone = entity.getMobilePhone();
		cep = entity.getCep();
		medicalSpecialty = entity.getMedicalSpecialty();
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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Integer getLandilinePhone() {
		return landilinePhone;
	}

	public void setLandilinePhone(Integer landilinePhone) {
		this.landilinePhone = landilinePhone;
	}

	public Integer getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Integer mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public MedicalSpecialty getMedicalSpecialty() {
		return medicalSpecialty;
	}

	public void setMedicalSpecialty(MedicalSpecialty medicalSpecialty) {
		this.medicalSpecialty = medicalSpecialty;
	}

}
