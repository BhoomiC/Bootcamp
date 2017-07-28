package EmployeeApplication;

import java.util.Collections;
import java.util.List;

/**
 * Created by chhedab on 7/27/2017.
 */
public class EmployeeSort  {
    public static List<Employee> sort(){
        List<Employee> emp = HighSalary.highersalary();
        Collections.sort(emp);
        return emp;
    }

}
