package Assignment3_ConcurrentAPI;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by chhedab on 7/31/2017.
 */
public class ComputeSumTask implements Runnable {
    public void run(){
        int sum = 0;
        for(int i = 1; i <= 500; i++){
            sum += i;
        }
        System.out.println("Sum of 500 numbers i "+sum);
    }
@Test
public void testThreadPool(){
        ComputeSumTask computeSumTask = new ComputeSumTask();
   Executor executor = Executors.newCachedThreadPool();
   for(int i = 0; i < 32; i++){
       executor.execute(computeSumTask);
   }

}
}

