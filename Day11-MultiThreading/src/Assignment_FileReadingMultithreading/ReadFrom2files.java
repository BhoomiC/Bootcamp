package Assignment_FileReadingMultithreading;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by chhedab on 7/31/2017.
 */
public class ReadFrom2files {
    @Test
    public void readDataTest(){

        BlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<Runnable>(5);
        AddData addData = new AddData(taskQueue);
        addData.addTaskInQueue();
        Worker worker = new Worker(taskQueue);
        worker.start();
        System.out.println("Done !");
    }


}

class Worker extends Thread {
    BlockingQueue<Runnable> taskQueue = null;

    Worker(BlockingQueue<Runnable> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        while (taskQueue != null) {
            try {
                Runnable task = taskQueue.take();
                task.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class AddData {
    BlockingQueue<Runnable> taskQueue = null;
    ReadfromFile1 file1 = new ReadfromFile1();
    ReadFromFile2 file2 = new ReadFromFile2();
    AddData(BlockingQueue<Runnable> taskQueue){
        this.taskQueue = taskQueue;
    }

    public void addTaskInQueue(){

        try {
            taskQueue.put(file1);
            taskQueue.put(file2);
            taskQueue.put(file2);
            taskQueue.put(file1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

