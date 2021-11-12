package com.alribeirom.armjava.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.alribeirom.armjava.dto.EmployeeDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Employee {
    @Getter
    private @Id @GeneratedValue Long id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String role;
    @Getter @Setter
    private LocalDate startDate;

    public Employee (EmployeeDTO eDto){
        this.firstName = eDto.firstName;
        this.lastName = eDto.lastName;
        this.role = eDto.role;
        this.startDate = eDto.startDate;
    }

    public String fullName(){
        return String.format("%s %s", this.firstName, this.lastName);
    }

    @Override
    public String toString(){
        return String.format(
            "%s %s, id: %s, current role: %s, employee since %s",
            this.firstName,
            this.lastName,
            this.id,
            this.role,
            this.startDate
        );
    }
}
