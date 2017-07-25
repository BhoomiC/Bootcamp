import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chhedab on 7/24/2017.
 */
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum Month{
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP,OCT, NOV, DEC
}

enum Year{
  YEAR2015, YEAR2016, YEAR2017, YEAR2018, YEAR2019, YEAR2020
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@interface Company{
    String name();
    String location();
}
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE})
@interface TimeStamp{
    Day day();
    Month month();
    Year year();
        }
public class Annotation {
}
