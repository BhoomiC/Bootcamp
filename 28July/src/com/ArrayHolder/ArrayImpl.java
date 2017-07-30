package com.ArrayHolder;

/**
 * Created by chhedab on 7/29/2017.
 */
public class ArrayImpl {
    public static void main(String[] args) {
        int[] values = new int[]{1, 2, 30, 5, 6, 4};
        ArrayHolder arrayHolder = new ArrayHolder(values);
        arrayHolder.forEach((Integer num) -> {
            System.out.printf("Number is %s%n", num);
        });
        int result = arrayHolder.fold((Integer num1, Integer num2) -> {
            return  num1 + num2;
        });
        System.out.println("Sum is : " + result);
        arrayHolder.modify((Integer num) -> {
             return num + 8;
        });
        arrayHolder.forEach((Integer num) -> {
            System.out.printf("Modified number is %S%n", num);
        });
        //arrayHolder.delete((Integer num)-> { return num % 2 == 0;});
        arrayHolder.forEach((Integer num) -> {
            System.out.printf("Numbers after deletion is %s%n", num);
        });



    }
}
