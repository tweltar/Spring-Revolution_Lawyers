package com.lora.lawyers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lora.lawyers.model.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Integer> {

}
