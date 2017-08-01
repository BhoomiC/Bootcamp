package Assignment1_Multithreading;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by chhedab on 7/31/2017.
 */
public class WorkerImplementation {
    BlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<Runnable>(7);
    int i = 10;

@Test
    public void testThreads(){
    WorkerValue workerValue = new WorkerValue(taskQueue);
    WorkerPrint workerPrint = new WorkerPrint(taskQueue);
    workerValue.start();
    workerPrint.start();

}
}
