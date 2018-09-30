package demo;

/**
 * @author QinQiang
 * @since 2018-09-30 11:11
 */
public class Demo26 {

    public static void main(String[] args) {

        String name = "hi";

        Runnable runnable = () -> System.out.println("1" + name);

        new Thread(runnable).start();






    }
}
