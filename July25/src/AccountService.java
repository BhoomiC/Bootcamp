public class AccountService {
    public AccountService() {
    }

    void updateSalary(Employee e, double salary) {
        e.setSalary(salary);
    }

    public double calculateTDS(Employee e) {
        return 0.2 * e.getSalary();
    }
}