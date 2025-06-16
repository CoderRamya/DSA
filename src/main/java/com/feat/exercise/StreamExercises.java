package com.feat.exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExercises {

    public static void main(String[] args) {
        //getEmployeeNames(DummyData.getEmployees());
        //getEmployeeBySalary(DummyData.getEmployees(),70000);
        //getEmployeesByDept(DummyData.getEmployees(), "HR");
        //getAvgSalaryByDept(DummyData.getEmployees());
        //getAverageSalaryByDept(DummyData.getEmployees());
        getEmployeeWith3Projects(DummyData.getEmployees());
    }


    public static void getEmployeeNames(List<Employee> employees){
        employees.stream().forEach(k-> System.out.println(k.getName()));
        List<String> empNames = employees.stream().map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(empNames);
    }

    public static void getEmployeeBySalary(List<Employee> employees, int salLimit){
        employees.stream().filter(e-> e.getSalary()>salLimit).
                forEach(k-> System.out.println(k.getName()+ ": Salary: " + k.getSalary()));
    }

    public static void getEmployeesByDept(List<Employee> employees, String dept){
        employees.stream().filter(e->e.getDepartment().equals(dept))
                .forEach(e-> System.out.println(e.getName() + "- Dept: " + e.getDepartment()));
    }

    public static void getAvgSalaryByDept(List<Employee> employees){

        Map<String, List<Employee>> namesByDept=  employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
        namesByDept.forEach((dept, emp) ->{
            System.out.println(dept + " , " + emp.stream().map(Employee::getName).
                    collect(Collectors.toList()));
        });
    }


    public static void getAverageSalaryByDept(List<Employee> employees){
        Map<String,Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    avgSalary.forEach((dept, sal)->{
        System.out.println(dept +" :" + sal);
    });
    }

    public static void getEmployeeWith3Projects(List<Employee> employees){
        employees.stream().filter(e-> e.getProjects().stream().count()>3).forEach(e-> System.out.println(e.getName()));


    }





    }

