package com.lora.lawyers.service;

import java.util.List;

import com.lora.lawyers.model.Lawyer;

public interface LawyerService {
	
	List<Lawyer> getAll();
	
	List<Lawyer> getByDivisionId(Integer divisionId);
	
	Lawyer getById(Integer lawyerId);
	
	Lawyer create(Lawyer lawyer);
	
	Lawyer update(Lawyer lawyer);
	
	void deleteById(Integer lawyerId);
}
