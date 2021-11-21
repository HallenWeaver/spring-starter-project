package com.alribeirom.armjava.repository;

import com.alribeirom.armjava.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
