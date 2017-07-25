import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chhedab on 7/22/2017.
 */
public class EmployeeTestData {
    public static List<Employee> createTestData(){
        Employee e1 = new Employee("Deepesh", "Parekh","R n D",345, "Pune");
        Employee e2 = new Employee("Deepesh", "Patel","R n D",332, "Pune");
        Employee e3 = new Employee("Suresh", "Shaikh","Finance",125, "Hyderbad");
        Employee e4 = new Employee("Ritesh", "Saxena","Finance",762, "Hyderabad");
        Employee e5 = new Employee("Smitesh", "Shah","Finance",855, "Pune");
        Employee e6 = new Employee("Nitesh", "Mehta","Admin",980, "Pune");
        Employee e7 = new Employee("Deepesh", "Parekh","Admin",145, "Pune");
        Employee e8 = new Employee("Natesh", "Naughty","HR",302, "Pune");
//        Employee e16 = new Employee("Deepesh", "Parikh","R n D",45, "Hyderabad");
     Employee e9 = new Employee("Mahesh", "Chaudhari","HR",32, "Pune");
        Employee e10 = new Employee("Deepesh", "Parekh","Techbical",3451, "Pune");
        Employee e11 = new Employee("Pritesh", "Singh","IT",3329, "Hyderabad");
        Employee e12 = new Employee("Deepesh", "Mahajan","R n D",3465, "Pune");
        Employee e13 = new Employee("Ashish", "Patel","Finance",3032, "Pune");
        Employee e14 = new Employee("Jagdish", "Parekh","Finance",3345, "Pune");
        Employee e15 = new Employee("Deepesh", "Patel","R n D",3320, "Pune");
        List<Employee> employee = Arrays.asList(e1, e2, e3, e4, e5, e6,e7, e8, e9, e10, e11,e12, e13, e14, e15);
        return employee;
    }
}
