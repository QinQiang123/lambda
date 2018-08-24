package demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author SiPingSoft
 * @since 2018-08-15 11:46
 */
public class Demo10 {
    public static void main(String[] args) {

        Stream<int[]> p = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0 && Math.sqrt(a * a + b * b) <= 100)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );
        p.forEach(t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));


        Stream<double[]> p1 = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                .filter(t -> t[2] % 1 == 0));
        p1.forEach(t -> System.out.println(t[0] + "," + t[1] + "," + t[2]));
    }
}
