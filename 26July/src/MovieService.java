/**
 * Created by chhedab on 7/26/2017.
 */
public class MovieService {

    public static void watch(User user) throws InvalidAge, UserAgeLessThan10,UserAgeLessThan20,LessThanRating{
        int age = user.getAge();
        int rating = user.getRating();
        if (rating < 3){
            throw new LessThanRating("User rating is below 3");
        }
        if(age <= 0) {
            throw new InvalidAge("User's age is not valid");
        } else if (age < 10){
            throw new UserAgeLessThan10("User's age is below 10 years");
        } else if(age  < 20) {
            throw new UserAgeLessThan20("User's age is below 20 years");
        }
    }

    public static void buy(User user, double price) throws PriceLessThan200, LessThanRating, UserAgeLessThan20, InvalidAge, UserAgeLessThan10 {
        int age = user.getAge();
        int rating = user.getRating();
        if (price < 200){
            throw new PriceLessThan200("Movie ticket's cost is less than Rs 200");

        }
        if (rating < 3){
            throw new LessThanRating("User rating is below 3");
        }
        if (age < 10){
            throw new UserAgeLessThan10("User's age is below 10 years");
        } else if(age  < 20) {
            throw new UserAgeLessThan20("User's age is below 20 years");
        } else if(age <= 0){
            throw new InvalidAge("User's age is not valid");
        }
    }
}
