package demo;

import com.jarvis.base.util.DateHelper;
import timeserializer.Order;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author QinQiang
 * @since 2018-10-08 9:13
 */
public class Demo28 {

    public static void main(String[] args) {
        Order order = new Order();
        order.setPayTime(LocalDateTime.now());
        System.out.println(order.getPayTime());


        Date date = new Date();

        System.out.println(DateHelper.formatDate(date));
        System.out.println(DateHelper.formatDate(date, "yyyy-MM-dd hh"));



    }
}
