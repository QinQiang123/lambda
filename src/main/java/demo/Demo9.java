package demo;

import pojo.Dish;
import pojo.GetMenuList;
import pojo.Trader;
import pojo.Transaction;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SiPingSoft
 * @since 2018-08-14 17:51
 */
public class Demo9 implements Comparable{

    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    static Stream<Transaction> stream = transactions.stream();


    public static void main(String[] args) {
        List<Dish> menu = GetMenuList.getList();

       int sum = menu.stream().mapToInt(Dish::getCalories)
                .sum();


        System.out.println(sum);


    }

    public static void get1() {
        List<Transaction> transactions = stream.filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(transactions);
    }

    public static void get2() {
        //List<String> transactions = stream.map(transaction -> transaction.getTrader().getCity())
        //        .distinct()
        //        .collect(Collectors.toList());
        Set<String> transactions = stream.map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());

        System.out.println(transactions);
    }

    public static void get3() {
        List<Trader> transactions = stream.map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());


        System.out.println(transactions);
    }

    public static void get4() {
        List<String> transactions = stream.map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList());


        System.out.println(transactions);
    }

    public static void get5() {
        stream.map(Transaction::getTrader)
                .filter(trader -> "Milan".equals(trader.getCity()))
                .findAny()
                .ifPresent(System.out::println);


    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
