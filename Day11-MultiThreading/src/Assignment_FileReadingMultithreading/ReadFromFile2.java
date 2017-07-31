package Assignment_FileReadingMultithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chhedab on 7/31/2017.
 */
public class ReadFromFile2 implements Runnable{
    public void run(){
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\chhedab\\IdeaProjects\\Bootcamp\\Day11-MultiThreading\\src\\Assignment_FileReadingMultithreading\\C.txt");
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

