import java.util.HashSet;
import java.util.Set;

/**
 * Created by chhedab on 7/25/2017.
 */
public class CarTestData{
    Set<Car> car = new HashSet<>(20);
    public Set<Car> cartest(){
        car.add(new Car("Audi", 426, 900.86));
        car.add(new Car("BMW", 556,122344));
        car.add(new Car("Mercedes", 999, 1000));
        car.add(new Car("Honda",777,123456));
        car.add(new Car("Hyundai", 416, 90006));
        car.add(new Car("BMW", 5116,1344));
        car.add(new Car("Porsche", 999, 1000));
        car.add(new Car("Hyundai",777,23456));
        car.add(new Car("Maruti", 426, 906));
        car.add(new Car("Nano", 546,198744));
        car.add(new Car("Ford", 739, 100000));
        car.add(new Car("Honda",770,156));
        car.add(new Car("Ferrari", 26, 900.86));
        car.add(new Car("BMW", 655,1244));
        car.add(new Car("Rools Royce", 129, 18000));
        car.add(new Car("Honda",237,1234));
       return car;
    }



}
