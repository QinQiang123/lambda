package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SiPingSoft
 * @since 2018-08-14 13:48
 */
public class Demo8 {
    public static void main(String[] args) {



        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);


        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> wordsLength = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordsLength);


        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> n = number.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(n);

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);

        List<int[]> pairs = number1.stream()
                .flatMap(i -> number2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        System.out.println(pairs);
        pairs.forEach(a -> System.out.println(Arrays.toString(a)));


        Integer sum = 0;

        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.println(sum);


        Integer sum2 = numbers.stream().reduce(0, (a, b) -> a + b);
        Integer sum3 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);
        System.out.println(sum3);

        Integer n1 = numbers.stream().reduce(0, Integer::max);
        Integer n2 = numbers.stream().reduce(0, Integer::min);

        System.out.println(n2);
        System.out.println(n1);

    }
}
