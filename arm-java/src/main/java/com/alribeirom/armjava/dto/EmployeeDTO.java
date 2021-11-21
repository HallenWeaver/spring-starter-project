package com.alribeirom.armjava.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

public class EmployeeDTO {
    @Getter @Setter
    public String firstName;
    @Getter @Setter
    public String lastName;
    @Getter @Setter
    public String role;
    @Getter @Setter
    public LocalDate startDate;
}
