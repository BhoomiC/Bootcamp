package EmployeeApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhedab on 7/27/2017.
 */
public class EmployeeTestData {
    public static List<Employee> createdata(){
        List<Employee> emp = new ArrayList<>(50);
        emp.add(new Employee(23, "Ram", 45,90000));
        emp.add(new Employee(2, "Rama", 45,900));
        emp.add(new Employee(3, "Ramesh", 45,23400));
        emp.add(new Employee(45, "Ramnik", 45,98000));
        emp.add(new Employee(96, "Ramanujan", 45,5000));
        emp.add(new Employee(12, "Ramnikant", 45,1000));
        emp.add(new Employee(77, "Ramalal", 45,3400));
        emp.add(new Employee(89, "Ramlon", 45,92000));
        emp.add(new Employee(2300, "Ramji", 45,15700));
        emp.add(new Employee(113, "Ritesh", 45,8000));
        emp.add(new Employee(66, "Rijul", 45,66000));
        emp.add(new Employee(122, "Ryan", 45,34000));
        emp.add(new Employee(900, "Ridhan", 45,78000));
        emp.add(new Employee(678, "Rishi", 45,32000));
        emp.add(new Employee(334, "Rimi", 45,8000));
        emp.add(new Employee(199, "Ricky", 45,10000));
        emp.add(new Employee(6, "Reene", 45,9900));
        emp.add(new Employee(300, "Rivaaz", 45,2000));
        emp.add(new Employee(14, "Reet", 45,9700));
        emp.add(new Employee(83, "Rick", 45,965500));
      return emp;
    }
}
