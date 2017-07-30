package com.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by chhedab on 7/29/2017.
 */
public class EmployeeImplementation {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Ram", 89000));
        employee.add(new Employee(67, "Rick", 6000));
        employee.add(new Employee(23, "Shyam", 40000));
        employee.add(new Employee(89, "Rasesh", 60000));
        employee.add(new Employee(33, "Sita", 2000));


        double tds = employee.stream().filter((Employee emp) -> emp.getSalary() > 50000).mapToDouble((Employee e) -> e.getSalary() * 0.10).reduce((acc, salary) -> acc + salary).getAsDouble();
        Stream<Employee> stream1 = employee.stream();

        System.out.println("Total no. of employees : " + stream1.count());
        Stream<Employee> stream3 = employee.stream();
        Employee max = employee.stream().max((Employee e1, Employee e2) -> e1.getSalary() - e2.getSalary()).get();
        System.out.println("Maximum salary receiving employee " + max);


        Employee min = employee.stream().min((Employee e1, Employee e2) -> e1.getSalary() - e2.getSalary()).get();
        System.out.println("Minimum salary receiving employee " + min);

        System.out.println("Total salary of employee is Rs. " + employee.stream().map((emp) -> emp.getSalary()).reduce((acc, emp) -> acc + emp).get());
        Stream<Employee> stream2 = employee.stream();
        double average = stream2.collect(Collectors.averagingDouble((Employee e) -> e.getSalary()));
        System.out.println("Average salary of all employees is " + average);

    }
}
