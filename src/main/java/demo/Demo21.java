package demo;

import java.util.stream.IntStream;

/**
 *
 * 递归方法的优化
 * @author QinQiang
 * @since 2018-08-27 16:57
 */
public class Demo21 {


    public static void main(String[] args) {





        System.out.println(jiecheng(5));
    }


    private static int jiecheng(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

}
