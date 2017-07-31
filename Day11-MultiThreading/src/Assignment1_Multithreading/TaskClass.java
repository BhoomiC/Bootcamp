package Assignment1_Multithreading;

/**
 * Created by chhedab on 7/31/2017.
 */
public class TaskClass {


    class ValueTask implements Runnable {
        int i;
        ValueTask(int i){
            this.i = i;
        }
        public void run(){
            i++;
        }


    }

    class PrintTask implements Runnable {
        int i;
        PrintTask(int i){
            this.i = i;
        }
        public void run() {
            System.out.printf(" i : %s%n", i);
        }
    }
}