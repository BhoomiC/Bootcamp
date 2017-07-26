import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by chhedab on 7/25/2017.
 */
public class IncreaseEmployeeSalary {


    @Test
    public void testMe() {

        List<EmployeeSalary> e = EmployeeHRA.testData();
        Iterator<EmployeeSalary> itr = e.iterator();

        while (itr.hasNext()) {
            EmployeeSalary emp = itr.next();
            System.out.println("Salary before increment condition " + emp.getSalary());
            if (emp.getSalary() < 20000) {
                emp.setSalary(emp.getSalary() * 1.2);
            }
            System.out.println("Salary after increment condition " + emp.getSalary());
        }
    }

}
