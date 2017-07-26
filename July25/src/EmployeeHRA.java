import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chhedab on 7/25/2017.
 */
public class EmployeeHRA {
    public static List<EmployeeSalary> testData() {
        List<EmployeeSalary> employee = new ArrayList<>(10);
        EmployeeSalary e1 = new EmployeeSalary(5368);
        EmployeeSalary e2 = new EmployeeSalary(536728);
        EmployeeSalary e3 = new EmployeeSalary(28);
        EmployeeSalary e4 = new EmployeeSalary(728);
        EmployeeSalary e5 = new EmployeeSalary(5728);
        EmployeeSalary e6 = new EmployeeSalary(536728);
        EmployeeSalary e7 = new EmployeeSalary(53);
        EmployeeSalary e8 = new EmployeeSalary(72);
        EmployeeSalary e9 = new EmployeeSalary(78);
        EmployeeSalary e10 = new EmployeeSalary(6728);
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);
        employee.add(e7);
        employee.add(e8);
        employee.add(e9);
        employee.add(e10);
        return employee;

    }

    public static void main(String[] args) {
        List<EmployeeSalary> e = testData();
        Iterator<EmployeeSalary> itr = e.iterator();
        while (itr.hasNext()) {
            System.out.println("HRA " + itr.next().getSalary()*0.30);

        }
    }




}
