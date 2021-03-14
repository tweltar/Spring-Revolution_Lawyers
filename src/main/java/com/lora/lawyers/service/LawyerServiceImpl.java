package com.lora.lawyers.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lora.lawyers.model.Lawyer;
import com.lora.lawyers.repository.LawyerRepository;

@Service
public class LawyerServiceImpl implements LawyerService {
	
	@Autowired
	private LawyerRepository lawyerRepository;

	@Override
	public List<Lawyer> getAll() {
		return lawyerRepository.findAll();
	}
	
	@Override
	public List<Lawyer> getByDivisionId(Integer divisionId) {
		return lawyerRepository.findByDivisionId(divisionId);
	}

	@Override
	public Lawyer getById(Integer lawyerId) {
		return lawyerRepository.getOne(lawyerId);
	}

	@Override
	public Lawyer create(Lawyer lawyer) {
		return lawyerRepository.saveAndFlush(lawyer);
	}

	@Override
	public Lawyer update(Lawyer lawyer) {
		Lawyer oldLawyer = lawyerRepository.getOne(lawyer.getLawyerId());
		BeanUtils.copyProperties(lawyer, oldLawyer, "id");
		return lawyerRepository.saveAndFlush(oldLawyer);
	}

	@Override
	public void deleteById(Integer lawyerId) {
		lawyerRepository.deleteById(lawyerId);
	}

}
