package demo;

import timeserializer.Order;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author QinQiang
 * @since 2018-10-08 9:13
 */
public class Demo28 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Order order = new Order();
        order.setPayTime(LocalDateTime.now());
        System.out.println(order.getPayTime());


        Date date = new Date();

        //TODO 要求输出a = 400, b = 500 请完成method方法
        int a = 4, b = 5;
        method(a, b);
        System.out.println("a = " + a + ", b = " + b);

    }

    private static void method(int a, int b) throws NoSuchFieldException, IllegalAccessException {
        Field value = Integer.valueOf(a).getClass().getDeclaredField("value");
        value.setAccessible(true);
        value.set(a, 400);

    }
}
