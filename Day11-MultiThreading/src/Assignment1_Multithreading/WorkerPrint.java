package Assignment1_Multithreading;

import java.util.concurrent.BlockingQueue;

/**
 * Created by chhedab on 7/31/2017.
 */
public class WorkerPrint {
    BlockingQueue<Runnable> taskQueue = null;
    WorkerPrint(BlockingQueue<Runnable> taskQueue){
        this.taskQueue = taskQueue;
    }
    public void run(){
        try {
            Runnable task = taskQueue.take();
            task.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
