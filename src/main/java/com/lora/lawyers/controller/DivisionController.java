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

import com.lora.lawyers.model.Division;
import com.lora.lawyers.service.DivisionService;

@RestController
@CrossOrigin
@RequestMapping("/division")
public class DivisionController {
	
	@Autowired
	DivisionService divisionService;
	
	@GetMapping
	public List<Division> getAll() {
		return divisionService.getAll();
	}
	
	@GetMapping(path = "{id}")
	public Division getById(@PathVariable Integer id) {
		return divisionService.getById(id);
	}
	
	@PostMapping
	public Division create(@RequestBody Division division) {
		return divisionService.create(division);
	}
	
	@RequestMapping(path = "{id}", method = RequestMethod.PUT)
	public Division update(@PathVariable Integer id, @RequestBody Division division) {
		return divisionService.update(division);
	}
	
	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable Integer id) {
		divisionService.deleteById(id);
	}

}
