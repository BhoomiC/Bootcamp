/**
 * Created by chhedab on 7/25/2017.
 */
public class EmployeeSalary {
    private double salary;

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "salary=" + salary +
                '}';
    }

    public EmployeeSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

