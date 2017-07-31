package Assignment_FileReadingMultithreading;

import java.io.*;

/**
 * Created by chhedab on 7/31/2017.
 */
public class ReadfromFile1 implements Runnable {
    public void run(){
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\chhedab\\IdeaProjects\\Bootcamp\\Day11-MultiThreading\\src\\Assignment_FileReadingMultithreading\\Java.txt");

            int b = fis.read();
            System.out.print((char)b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


