package demo;

/**
 * @author QinQiang
 * @since 2018-09-25 15:29
 */
public class Demo25 {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        System.out.print("a和b交换前：");
        System.out.print(a);
        System.out.print(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a和b交换后：");
        System.out.print(a);
        System.out.print(b);

        Integer c = 10;
        Object d = c;
        System.out.println(d.getClass().getClass());


    }
}
