/**
 * Created by chhedab on 7/25/2017.
 */
public class Employee {
    private int empId;
    private String name;
    private String phone;
    private String desig;
    private double salary;
    private String project;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int empId, String name, String phone, String desig, double salary, String project) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
        this.desig = desig;
        this.salary = salary;
        this.project = project;
    }

    public Employee(int empId, String name, String phone, String desig) {
        this.empId = empId;
        this.name = name;

        this.phone = phone;
        this.desig = desig;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

}
