package com.lora.lawyers.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity(name = "division")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Division extends MainModel {
	
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	@NotNull
	private Integer id;
	  
	private String division;
	
//	@OneToMany(mappedBy = "division", cascade = CascadeType.REMOVE)
//	@JsonIgnoreProperties("division")
//	private Set<Lawyer> lawyers = new HashSet<>();
	
	public Division() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

//	public Set<Lawyer> getLawyers() {
//		return lawyers;
//	}
//
//	public void setLawyers(Set<Lawyer> lawyers) {
//		this.lawyers = lawyers;
//	}
}
