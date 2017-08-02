package com.concurrent.assignment2;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by chhedab on 8/1/2017.
 */
public class ExecutorCallable {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    @Test
    public void testPrimeTask(){
        Future<Integer> future1 = executorService.submit(new GeneratePrimeTill_100Task());
        Future<Integer> future2 = executorService.submit(new GeneratePrimeTill_200Task());
        Future<Integer> future3 = executorService.submit(new GeneratePrimeTill_300Task());
        Future<Integer> future4 = executorService.submit(new GeneratePrimeTill_400Task());
        Future<Integer> future5 = executorService.submit(new GeneratePrimeTill_500Task());
        try {
            System.out.printf("Total of prime nos is : %d%n",(future1.get()+ future2.get()+future3.get()+future4.get()+future5.get()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    }


class isPrime{
    public static boolean isPrime(int num){
        for (int i = 2; i < Math.sqrt(num); i++){
            if(num %i == 0) {
                return false;
            }
        }
        return true;
    }
}
class GeneratePrimeTill_100Task implements Callable<Integer> {
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (isPrime.isPrime(i))
                sum = sum + i;
        }
        System.out.println("SUM IS : " + sum);
        return sum;
    }
}
class GeneratePrimeTill_200Task implements Callable<Integer>{
    public Integer call(){
        int sum = 0;
        for (int i = 101; i <= 200;i= i+2){
            if(isPrime.isPrime(i))
                sum = sum + i;
        }
        return sum;
    }
}

class GeneratePrimeTill_300Task implements Callable<Integer> {
    public Integer call() {
        int sum = 0;
        for (int i = 201; i <= 300; i = i + 2) {
            if (isPrime.isPrime(i))
                sum = sum + i;
        }
        return sum;
    }
}
class GeneratePrimeTill_400Task implements Callable<Integer> {
    public Integer call() {
        int sum = 0;
        for (int i = 301; i <= 400; i = i + 2) {
            if (isPrime.isPrime(i))
                sum = sum + i;
        }
        return sum;
    }
}
class GeneratePrimeTill_500Task implements Callable {
    public Integer call() {
        int sum = 0;
        for (int i = 401; i <= 500; i = i + 2) {
            if (isPrime.isPrime(i))
                sum = sum + i;
        }
        return sum;
    }
}

