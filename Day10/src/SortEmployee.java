import java.util.Collections;
import java.util.List;

/**
 * Created by chhedab on 7/22/2017.
 */
public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> emp = EmployeeTestData.createTestData();
     Collections.sort(emp, new EmployeeComparator());
//        emp.sort(new EmployeeComparator());
        for(Employee e : emp){
            System.out.println(e);
        }
    }
}
