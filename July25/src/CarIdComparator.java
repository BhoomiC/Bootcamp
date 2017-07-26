import java.util.Comparator;

/**
 * Created by chhedab on 7/25/2017.
 */
public class CarIdComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2){
        return car1.getId() - car2.getId();
    }
}
