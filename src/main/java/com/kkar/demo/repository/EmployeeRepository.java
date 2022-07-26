package com.kkar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kkar.demo.model.EmployeeEntity;
 
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
 
	
	
	
}
