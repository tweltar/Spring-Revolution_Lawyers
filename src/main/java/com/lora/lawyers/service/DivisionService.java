package com.lora.lawyers.service;

import java.util.List;

import com.lora.lawyers.model.Division;

public interface DivisionService {
	
	List<Division> getAll();
	
	Division getById(Integer id);
	
	Division create(Division division);
	
	Division update(Division division);
	
	void deleteById(Integer id);
	
}
