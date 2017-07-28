package com.calculator;

/**
 * Created by chhedab on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args) {
       double result =  CalculatorService.calculateoperation(25.5, 0.6,(double num1, double num2) -> {
            return (num1+ num2);
        });
        System.out.printf("Result is  : %s%n",result);
        result = CalculatorService.calculateoperation(43.5, 8.9,(double num1, double num2) -> {
            return (num1 - num2);
        });
        System.out.printf("Result is  : %s%n",result);
        CalculatorService.calculateoperation(25, 106,(double num1, double num2) -> {
           return (num1 * num2);
        });
        System.out.printf("Result is  : %s%n",result);
        CalculatorService.calculateoperation(215, 16.8,(double num1, double num2) -> {
           return(num1 / num2);
        });
        System.out.printf("Result is  : %s%n",result);
    }
}
