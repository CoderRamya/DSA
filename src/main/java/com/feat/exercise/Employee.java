package com.feat.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements  Comparable<Employee>{
    private int id;
    private int age;
    private String gender;
    private String name;
    private String department;
    private double salary;
    private List<String> projects;

    @Override
    public int compareTo(Employee o) {
        return this.age-o.age;
    }


    // Constructors, getters, setters, toString
}

