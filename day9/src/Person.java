/**
 * Created by chhedab on 7/21/2017.
 */
public class Person {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, String gender) {

        this.name = name;
        this.gender = gender;
    }
    @Override
    public boolean equals(Object o){
        Person p = (Person)o;
        if(p == null) {
            return false;
        }
        if (this.getName().equalsIgnoreCase(p.getName()) && this.getGender().equalsIgnoreCase(p.getGender())){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        String name = this.name;
        String gender = this.gender;
        String person = name+gender;
        int hash = 0;
        for (int i = 0; i < person.length(); i++){
            hash += person.charAt(i)*31^(person.length()-i-1);
        }
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
