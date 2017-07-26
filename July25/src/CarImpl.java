import org.junit.Test;

/**
 * Created by chhedab on 7/26/2017.
 */
public class CarImpl {
    @Test
    public  void test() {
        SortCar cars = new SortCar();
        cars.sortByPrice();
        cars.sortByBrand();
        cars.sortById();
    }
}
