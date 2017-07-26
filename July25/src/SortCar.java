import java.util.*;

/**
 * Created by chhedab on 7/25/2017.
 */
 class SortCar {
    public void sortByPrice() {
        Set<Car> carlist  = new CarTestData().cartest();
        List<Car> cars = new ArrayList<>(carlist);
        Collections.sort(cars);
        Iterator<Car> itr  = cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    public void sortByBrand(){
        Set<Car> carlist  = new CarTestData().cartest();
        List<Car> cars = new ArrayList<>(carlist);
        Collections.sort(cars, new CarBrandComparator());
        Iterator<Car> itr  = cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void sortById(){
        Set<Car> carlist =  new CarTestData().cartest();
        List<Car> cars = new ArrayList<>(carlist);
        Iterator<Car> itr  = cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
