/**
 * Created by chhedab on 7/21/2017.
 */
public class Persontest {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ramesh", "M");
        Person p3 = new Person("Ramesh", "M");
        Person p4 = null;
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1)); //reflexitivity
        System.out.println(p2.equals(p1));//symmetry
        System.out.println(p2.equals(p3));//transitivity
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4)); //Check null pointer exception
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));//JVM maintains integer pool for -128 to 127. Hence 1 shows true and for 1000 false


    }
}
