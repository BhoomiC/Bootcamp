package EmployeeApplication;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chhedab on 7/27/2017.
 */
public class StoreObjectsinFile {
    public static void main(String[] args) throws IOException {
        List<Employee> emp = EmployeeSort.sort();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\chhedab\\IdeaProjects\\Bootcamp\\27July\\Employees.txt");
            oos = new ObjectOutputStream(fos);
            Iterator<Employee> itr = emp.iterator();
            while (itr.hasNext()) {
                Employee e = itr.next();
                oos.writeObject(e);
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(oos != null){
                oos.close();
            }
            if(fos != null){
                fos.close();
            }
        }
        try{
            fis = new FileInputStream("C:\\Users\\chhedab\\IdeaProjects\\Bootcamp\\27July\\Employees.txt");
            ois = new ObjectInputStream(fis);
            Employee e = (Employee)ois.readObject();
            try {
                while (e != null) {
                    System.out.println(e);
                    e = (Employee) ois.readObject();
                }
            } catch (EOFException ex) {
                return;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } finally {
            if(ois != null){
                ois.close();
            }
            if(fis != null){
                fis.close();
            }
        }
    }
}
