package demo;


import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

/**
 * 将小于整数n的数 分为质数和非质数
 *
 * @author QinQiang
 * @since 2018-08-23 17:00
 */
public class Demo16 {


    static boolean isPrime(int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, candidateRoot).boxed()
                .noneMatch(i -> candidate % i == 0);
    }
    static boolean isPrime(List<Integer> primes, int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return takeWhile(primes,i -> i <= candidateRoot)
                .stream().noneMatch(i -> candidate % i == 0);
    }

    static <A> List<A> takeWhile(List<A> list, Predicate<A> p) {
        int i = 0;
        for (A item : list) {
            if (!p.test(item)) {
                return list.subList(0, i);
            }
            i++;
        }
        return list;
    }


    static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(partitioningBy(candidate -> isPrime(candidate)));
    }

    public static void main(String[] args) {
        System.out.println(partitionPrimes(50));
    }

}
