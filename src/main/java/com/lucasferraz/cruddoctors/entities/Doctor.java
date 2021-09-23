package com.lucasferraz.cruddoctors.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_doctor")
public class Doctor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(max = 120)
	private String name;
	
	@NotNull
	@Size(max = 7)
	private String crm;
	
	@Column(name = "landiline")
	private Integer landilinePhone;
	
	@Column(name = "mobile")
	private Integer mobilePhone;
	private Integer cep;
	
	@ManyToMany
	@JoinTable(name = "tb_doctor_specialty",
		joinColumns = @JoinColumn(name = "doctor_id"),
		inverseJoinColumns = @JoinColumn(name ="specialty_id"))
	Set<Specialty> specialties = new HashSet<>();
	
	
	public Doctor() {
	}

	public Doctor(Integer id, String name, String crm, Integer landilinePhone, Integer mobilePhone, Integer cep) {
		this.id = id;
		this.name = name;
		this.crm = crm;
		this.landilinePhone = landilinePhone;
		this.mobilePhone = mobilePhone;
		this.cep = cep;		
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

	public Set<Specialty> getSpecialties() {
		return specialties;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
