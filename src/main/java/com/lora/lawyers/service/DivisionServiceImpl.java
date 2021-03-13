package com.lora.lawyers.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lora.lawyers.model.Division;
import com.lora.lawyers.repository.DivisionRepository;

@Service
public class DivisionServiceImpl implements DivisionService {
	
	@Autowired
	private DivisionRepository divisionRepository;

	@Override
	public List<Division> getAll() {
		return divisionRepository.findAll();
	}

	@Override
	public Division getById(Integer id) {
		return divisionRepository.getOne(id);
	}

	@Override
	public Division create(Division division) {
		return divisionRepository.saveAndFlush(division);
	}

	@Override
	public Division update(Division division) {
		Division oldDivision = divisionRepository.getOne(division.getId());
		BeanUtils.copyProperties(division, oldDivision, "id");
		return divisionRepository.saveAndFlush(oldDivision);
	}

	@Override
	public void deleteById(Integer id) {
		divisionRepository.deleteById(id);
	}

}
