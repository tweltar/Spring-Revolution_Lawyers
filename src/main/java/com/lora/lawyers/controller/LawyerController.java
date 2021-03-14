package com.lora.lawyers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lora.lawyers.model.Lawyer;
import com.lora.lawyers.service.LawyerService;

@RestController
@CrossOrigin
@RequestMapping("/lawyer")
public class LawyerController {
	
	@Autowired
	private LawyerService lawyerService;
	
	@GetMapping
	public List<Lawyer> getAll() {
		return lawyerService.getAll();
	}
	
	@GetMapping(path = "/division/{divisionId}")
	public List<Lawyer> getByDivisionId(@PathVariable Integer divisionId) {
		return lawyerService.getByDivisionId(divisionId);
	}
	
	@GetMapping(path = "{lawyerId}")
	public Lawyer getById(@PathVariable Integer lawyerId) {
		return lawyerService.getById(lawyerId);
	}
	
	@PostMapping
	public Lawyer create(@RequestBody Lawyer lawyer) {
		return lawyerService.create(lawyer);
	}
	
	@RequestMapping(path = "{lawyerId}", method = RequestMethod.PUT)
	public Lawyer update(@PathVariable Integer lawyerId, @RequestBody Lawyer lawyer) {
		return lawyerService.update(lawyer);
	}
	
	@RequestMapping(path = "{lawyerId}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer lawyerId) {
		lawyerService.deleteById(lawyerId);
	}
}
