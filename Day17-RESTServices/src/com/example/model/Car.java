package com.example.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "mycar")
public class Car {


    int vin;
    String name;
    String make;
    double price;
    int qty;

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Car(int vin, String name, String make, double price, int qty) {
        this.vin = vin;
        this.name = name;
        this.make = make;
        this.price = price;
        this.qty = qty;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", name='" + name + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @XmlElement(name = "id")
    public int getVin() {
        return vin;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "brand")
    public String getMake() {
        return make;
    }

    @XmlTransient
    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
