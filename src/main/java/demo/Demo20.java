package demo;

import java.time.*;
import java.time.temporal.ChronoField;

/**
 * java8中对日期的处理新方式
 * @author QinQiang
 * @since 2018-08-27 16:04
 */


public class Demo20 {

    public static void main(String[] args) {
        //Date date = new Date(114, 2, 18);

        LocalDate date = LocalDate.of(2018, 8, 27);
        int year = date.getYear();
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int len = date.lengthOfMonth();
        boolean leap = date.isLeapYear();

        LocalTime time = LocalTime.of(16, 13, 55);

        LocalDateTime dateTime = LocalDateTime.of(date, time);


        int day1 = Instant.now().get(ChronoField.DAY_OF_MONTH);


        System.out.println(day1);
        System.out.println(date);
        System.out.println(dateTime);
    }
}
