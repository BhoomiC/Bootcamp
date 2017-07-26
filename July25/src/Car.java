/**
 * Created by chhedab on 7/25/2017.
 */
public class Car  implements Comparable<Car>{
    private String brand;
    private int id;
    private double price;

    public Car(String brand, int id, double price) {
        this.brand = brand;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int compareTo(Car car){
        return (int)this.price - (int)car.getPrice();
    }
}
