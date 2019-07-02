package demo;

import java.lang.reflect.Field;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-09 10:22
 */
public class Demo28 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

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
