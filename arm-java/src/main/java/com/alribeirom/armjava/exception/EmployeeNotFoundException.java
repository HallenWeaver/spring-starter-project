package com.alribeirom.armjava.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String id){
        super(String.format("Unable to locate employee with id %s", id));
    }
}
