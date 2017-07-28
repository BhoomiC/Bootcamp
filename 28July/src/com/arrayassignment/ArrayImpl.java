package com.arrayassignment;

/**
 * Created by chhedab on 7/28/2017.
 */
public class ArrayImpl {
    public static void main(String[] args) {
        int[] values = {2, 5, 7, 45, 67, 55, 89, 10};
        int result = ArrayService.operationonallelements(values, (int [] arr) -> {
            int sum = 0;
            for (int num: arr){
                sum += num;
            }
            return sum;
        });
        System.out.printf("Sum of numbers in array %s", result);
        int flag = ArrayService.operationonallelements(values, (int [] arr) -> {
            for(int num : arr){
                System.out.printf("Number is : %s%n",num);
            }
            return 1;
        });

    }
}
