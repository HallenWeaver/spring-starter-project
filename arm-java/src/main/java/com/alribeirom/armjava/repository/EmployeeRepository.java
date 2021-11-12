package com.alribeirom.armjava.repository;

import com.alribeirom.armjava.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
