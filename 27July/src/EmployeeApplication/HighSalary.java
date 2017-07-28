package EmployeeApplication;

import java.util.Iterator;
import java.util.List;

/**
 * Created by chhedab on 7/27/2017.
 */
public class HighSalary {
    public static List<Employee> highersalary(){
        List<Employee> highSal = EmployeeTestData.createdata();
        Iterator<Employee> itr = highSal.iterator();
        while(itr.hasNext()){
            Employee e = itr.next();
            if(e.getSalary() < 40000){
                itr.remove();
            }
        }
        return highSal;
    }
}
