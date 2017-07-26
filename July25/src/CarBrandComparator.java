import java.util.Comparator;

/**
 * Created by chhedab on 7/26/2017.
 */
public class CarBrandComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2){
        return car1.getBrand().compareTo(car2.getBrand());
    }

}

