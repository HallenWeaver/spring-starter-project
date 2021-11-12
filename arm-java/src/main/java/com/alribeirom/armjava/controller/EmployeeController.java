package com.alribeirom.armjava.controller;

import java.util.List;

import com.alribeirom.armjava.dto.EmployeeDTO;
import com.alribeirom.armjava.exception.EmployeeNotFoundException;
import com.alribeirom.armjava.model.Employee;
import com.alribeirom.armjava.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository){
        this.repository = repository;
    }

    @PostMapping
    public Employee create(@RequestBody EmployeeDTO newEmployee){
        Employee employee = new Employee(newEmployee);
        return repository.save(employee);
    }

    @GetMapping
    public List<Employee> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        repository.deleteById(id);
    }
}
