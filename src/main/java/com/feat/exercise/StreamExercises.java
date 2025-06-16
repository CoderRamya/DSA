package com.feat.exercise;

import java.util.List;

public class StreamExercises {

    public static void main(String[] args) {
        getEmployeeNames(DummyData.getEmployees());
        getEmployeeBySalary(DummyData.getEmployees(),70000);
        getEmployeesByDept(DummyData.getEmployees(), "HR");
    }


    public static void getEmployeeNames(List<Employee> employees){
        employees.stream().forEach(k-> System.out.println(k.getName()));
    }

    public static void getEmployeeBySalary(List<Employee> employees, int salLimit){
        employees.stream().filter(e-> e.getSalary()>salLimit).
                forEach(k-> System.out.println(k.getName()+ ": Salary: " + k.getSalary()));
    }

    public static void getEmployeesByDept(List<Employee> employees, String dept){
        employees.stream().filter(e->e.getDepartment().equals(dept))
                .forEach(e-> System.out.println(e.getName() + "- Dept: " + e.getDepartment()));
    }

}
