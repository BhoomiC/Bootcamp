/**
 * Created by chhedab on 7/26/2017.
 */
public class User {
    private int uid;
    private String name;
    private int age;
    private int rating;

    public User(int uid, String name, int age, int rating) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRating() {
        return rating;
    }
}
