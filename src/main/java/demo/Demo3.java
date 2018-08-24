package demo;

/**
 * @author SiPingSoft
 * @create 2018-07-31 14:51
 */
public class Demo3 {

    public final int value = 4;

    public void doInt() {
        int value = 6;
        Runnable r = new Runnable() {
            final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.doInt();
    }


}
