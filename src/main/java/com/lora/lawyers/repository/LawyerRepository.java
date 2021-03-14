package com.lora.lawyers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lora.lawyers.model.Lawyer;

@Repository
public interface LawyerRepository extends JpaRepository<Lawyer, Integer> {
	 
	List<Lawyer> findByDivisionId(Integer divisionId);

}
