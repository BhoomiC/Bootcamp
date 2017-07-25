/**
 * Created by chhedab on 7/25/2017.
 */
public class EmployeeImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee(25, "Ram", "12345", "Tech", 54638.97, "Java");
        HRService.changeDesignation(e1, "Senior");
        System.out.println(e1.getDesig());
    }
}
