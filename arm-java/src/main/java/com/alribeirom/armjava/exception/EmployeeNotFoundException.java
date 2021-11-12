package com.alribeirom.armjava.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id){
        super(String.format("Unable to locate employee with id %s", id));
    }
}
