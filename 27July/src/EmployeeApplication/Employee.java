package EmployeeApplication;

import java.io.Serializable;

/**
 * Created by chhedab on 7/27/2017.
 */
public class Employee implements Comparable<Employee>, Serializable {
    private int eid;
    private String name;
    private int age;
    transient private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +

                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public int getEid() {
        return eid;
    }

    public Employee(int eid, String name, int age, double salary) {
        this.eid = eid;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Employee e){
        return this.eid - e.getEid();
    }
}
