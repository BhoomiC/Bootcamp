import java.util.HashMap;
import java.util.Map;

/**
 * Created by chhedab on 7/21/2017.
 */
public class personHash {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ram", "M");
        Person p3 = new Person("Rakesh", "M");
        Person p4 = new Person("Ritesh", "M");
        Person p5 = new Person("Ritu", "F");
        Person p6 = new Person("Ramesh", "M");
        Person p7 = new Person("Rishikesh", "M");
        Person p8 = new Person("Ramesh", "F");
        System.out.println(p1.hashCode() == p7.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());
        Map<Integer, Person> hashmap = new HashMap();
        hashmap.put(p1.hashCode(), p1);
        hashmap.put(p2.hashCode(), p2);
        hashmap.put(p3.hashCode(), p3);
        hashmap.put(p4.hashCode(), p4);
        hashmap.put(p5.hashCode(), p5);
        hashmap.put(p6.hashCode(), p6);
        hashmap.put(p7.hashCode(), p7);
        hashmap.put(p8.hashCode(), p8);
        for(Integer i : hashmap.keySet()){
            System.out.println("Hashcode " + i + hashmap.get(i));
        }
    }


}
