package Assignment1_Multithreading;

import org.junit.Test;

/**
 * Created by chhedab on 7/31/2017.
 */
public class TwoThreadsTwoTasks {
    int i = 10;

    @Test
    public void testUsingLambda() {
        for (int j = 0; j < 20; j++) {
            new Thread(() -> {
                i++;
            }).start();
            new Thread(() -> System.out.println("Value is " + i)).start();

        }
    }
}
