import java.util.List;

/**
 * Created by chhedab on 7/22/2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private int employeeId;
    private String location;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", employeeId=" + employeeId +
                ", location='" + location + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(String firstName, String lastName, String department, int employeeId, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.employeeId = employeeId;

        this.location = location;
    }



}
