import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by chhedab on 7/27/2017.
 */
public class WriteDataInFile {
    public static void main(String[] args) {
        Set<String> car = new HashSet<>();
        car.add("BMW");
        car.add("Merc");
        car.add("Audi");
        car.add("Porsche");
        car.add("Rolls Royce");
        BufferedWriter out = null;
        FileWriter write = null;
        try {
             write = new FileWriter("C:\\Users\\chhedab\\IdeaProjects\\Bootcamp\\27July\\cars.txt");
              {
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        Iterator<String> itr = car.iterator();
        try{
            while(itr.hasNext()){
                write.write(itr.next()+ "\n");
            }
        } catch(IOException e){
            e.printStackTrace();
            }
            try{
            if(write != null) {
                write.close();
            }

            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
