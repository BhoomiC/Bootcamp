/**
 * Created by chhedab on 7/22/2017.
 */
public class classString {
    public static void main(String[] args) {
        String name = new String("cdk");
        String name1 = name.intern();
        String name2 = "CDK";
        System.out.println(name ==(name1));
        System.out.println(name1 ==(name2));
        System.out.println(name == (name2));

    }
}
