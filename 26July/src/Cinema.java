/**
 * Created by chhedab on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user1 = new User(123, "ram", 3, 6);
        User user = new User(998, "Shyam",26,6);
        try{
            MovieService.watch(user);
            MovieService.buy(user, 1);
        } catch (UserAgeLessThan10 userAgeLessThan10) {
            System.out.println(userAgeLessThan10.getMessage());
        } catch (LessThanRating lessThanRating) {
            System.out.println(lessThanRating.getMessage());
        } catch (UserAgeLessThan20 userAgeLessThan20) {
            System.out.println(userAgeLessThan20.getMessage());
        } catch (InvalidAge invalidAge) {
            System.out.println(invalidAge.getMessage());
        }
        catch (PriceLessThan200 price){
            System.out.println(price.getMessage());
        }
    }
    }
