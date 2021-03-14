package com.lora.lawyers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "lawyer")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Lawyer extends MainModel {
	
	@Id
	@Column(name = "lawyer_id", updatable = false, nullable = false)
	private Integer lawyerId;
	
	private String lawyerName;
	private String office;
	private String position;
	private String type;
	
	@Column(name = "ph_1")
	private String ph1;
	
	@Column(name = "ph_2")
	private String ph2;

	@Column(name = "ph_3")
	private String ph3;

	@Column(name = "ph_4")
	private String ph4;

	@Column(name = "ph_5")
	private String ph5;
	
	private String township;
	
	private String town;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "division_id", nullable = false)
	@JsonIgnoreProperties("lawyer")
	private Division division;
	
	
	public Lawyer() {}

	public Integer getLawyerId() {
		return lawyerId;
	}

	public void setLawyerId(Integer lawyerId) {
		this.lawyerId = lawyerId;
	}

	public String getLawyerName() {
		return lawyerName;
	}

	public void setLawyerName(String lawyerName) {
		this.lawyerName = lawyerName;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPh1() {
		return ph1;
	}

	public void setPh1(String ph1) {
		this.ph1 = ph1;
	}

	public String getPh2() {
		return ph2;
	}

	public void setPh2(String ph2) {
		this.ph2 = ph2;
	}

	public String getPh3() {
		return ph3;
	}

	public void setPh3(String ph3) {
		this.ph3 = ph3;
	}

	public String getPh4() {
		return ph4;
	}

	public void setPh4(String ph4) {
		this.ph4 = ph4;
	}

	public String getPh5() {
		return ph5;
	}

	public void setPh5(String ph5) {
		this.ph5 = ph5;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

}
