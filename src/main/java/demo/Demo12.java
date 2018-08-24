package demo;

import pojo.Dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SiPingSoft
 * @since 2018-08-15 15:03
 */
public class Demo12 {
    public static void main(String[] args) {

        //Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
        //        .limit(20)
        //        .map(t -> t[0])
        //        .forEach(System.out::print);


        List<Integer> ints = Stream.generate(() -> new Random().nextInt(10))
        .limit(10)
        .collect(Collectors.toList());
        System.out.println(ints);

        ints.forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
    }
}
