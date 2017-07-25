import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by chhedab on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        if(e1.getLocation() != e2.getLocation()){
            return e1.getLocation().compareToIgnoreCase(e2.getLocation());
        } else if(!(e1.getDepartment().equalsIgnoreCase(e2.getDepartment()))){
            return e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
        } else if(!(e1.getFirstName().equalsIgnoreCase(e2.getFirstName()))){
            return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
        } else if(!(e1.getLastName().equalsIgnoreCase(e2.getLastName()))){
            return e1.getLastName().compareToIgnoreCase(e2.getLastName());
        } else {
            return e1.getEmployeeId() - e2.getEmployeeId();
        }
    }

}
