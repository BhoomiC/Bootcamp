package com.example.controller;


import com.example.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarResourceController {

    @Autowired
    com.example.dao.CarDAO carDAO;
    /*@RequestMapping(value = "car", produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public String readCar(){
        return "vin-100, name-Q7 make-Audi, price-78000000.00, qty-10";
    }

    @RequestMapping(value = "car", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String readCaAsJson(){
        return "{\"vin\":100, \"name\":\"Q7\",\"make\":\"Audi\", \"price\":78000000.00, \"qty\":10}";
    }

    @RequestMapping(value = "car", produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public String readCarAsXml(){
        return "<car> <vin> 100 </vin> <model> Q7</model> <make>Audi</make> <price> 780000</price> <qty> 100</qty></car>";
    }*/
    @RequestMapping(value = "car", produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Car readCarAsXml(){
        Car car = carDAO.selectByVin(1000);
        return car;
    }

    @RequestMapping(value = "car", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Car readCaAsJson(){
        Car car = carDAO.selectByVin(1000);
        return car;
    }

}
