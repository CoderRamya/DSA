package com.feat.exercise;

import java.util.List;

public class DummyData {
    public static List<Employee> getEmployees() {
        return List.of(
                new Employee(101, "Alice", "HR", 60000, List.of("P1", "P3")),
                new Employee(102, "Bob", "Finance", 75000, List.of("P2")),
                new Employee(103, "Charlie", "IT", 80000, List.of("P1", "P4", "P5")),
                new Employee(104, "David", "IT", 85000, List.of("P4")),
                new Employee(105, "Eve", "HR", 62000, List.of("P3"))
        );
    }
}

