package com.feat.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExercises {

    public static void main(String[] args) {
        //getEmployeeNames(DummyData.getEmployees());
        //getEmployeeBySalary(DummyData.getEmployees(),70000);
       // getEmployeesByDept(DummyData.getEmployees(), "HR");
        //getAvgSalaryByDept(DummyData.getEmployees());
       // getAverageSalaryByDept(DummyData.getEmployees());
        //getEmployeeWith3Projects(DummyData.getEmployees());
       // Arrays.sort(DummyData.getEmployees().stream().map(Employee::getId).collect(Collectors.toList()).toArray());
        //DummyData.getEmployees().stream().sorted((o1,o2)-> o2.getAge()-o1.getAge()).forEach(System.out::println);


        /*List<Product> products = Arrays.asList(new Product("Laptop", "Electronics"),
                new Product("Phone", "Electronics"),
                new Product("Shirt", "Clothing"),
                new Product("Jacket", "Clothing"));

        Map<String,Long> map= products.stream().
                collect(Collectors.groupingBy(Product::getType,Collectors.counting()));
        map.forEach((k,v)-> System.out.println(k + ":" + v));*/

        Map<String, Long> basedOnGender= DummyData.getEmployees().stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()) );
        basedOnGender.entrySet().stream().forEach((e)-> System.out.println(e.getKey() + " :" + e.getValue() ));


        Optional<Employee> employee = DummyData.getEmployees().stream().max(Comparator.comparingDouble(Employee::getSalary));
        employee.ifPresent(e-> System.out.println(e.getName() +":"+ e.getSalary()));


        Optional<Employee> emp1 = DummyData.getEmployees().stream().sorted((e1,e2)->e2.getAge()-e1.getAge())
                .limit(1).findFirst();
        emp1.ifPresent(e->System.out.println(e.getName()));

        List<Integer> numbers = Arrays.asList(1,2,3,4,1,2,3,4,5,6,6,7,8,9,0);

        List<Integer> duplicates= numbers.stream()
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicates);

        String s="hello";
        System.out.println(s.chars()
                .filter(c->c!='e')
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining()));

        String s1="helloo@#$121323";
        System.out.println(s1.chars()
                .filter(c->!Character.isLetterOrDigit(c))
                .mapToObj(c-> String.valueOf((char)c))
                .collect(Collectors.joining()));






   }


    public static void getEmployeeNames(List<Employee> employees){
        //employees.stream().forEach(k-> System.out.println(k.getName()));
        List<String> empNames = employees.stream().map(k-> k.getName())
                .collect(Collectors.toList());
        System.out.println(empNames);
    }

    public static void getEmployeeBySalary(List<Employee> employees, int salLimit){
        employees.stream().filter(e-> e.getSalary()>salLimit).
                forEach(k-> System.out.println(k.getName()+ ": Salary: " + k.getSalary()));
    }

    public static void getEmployeesByDept(List<Employee> employees, String dept){
        employees. stream()
                .collect(Collectors.groupingBy(e->e.getDepartment())).entrySet().
                stream().
                forEach(e->System.out.println(e.getKey() + " - " +e.getValue().stream().map(Employee::getName)));

        //employees.stream().filter(e->e.getDepartment().equals(dept))
         //       .forEach(e-> System.out.println(e.getName() + "- Dept: " + e.getDepartment()));
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


     employees.stream().collect(Collectors.groupingBy((Employee::getDepartment))).entrySet().stream().
             filter(e->e.getValue().size()==2).forEach(e-> System.out.println(e.getKey()));

    }

    public static void getEmployeeWith3Projects(List<Employee> employees){
        employees.stream().filter(e-> e.getProjects().stream().count()>3).forEach(e-> System.out.println(e.getName()));


    }





    }

