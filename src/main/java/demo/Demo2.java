package demo;

import demointerface.AppleFancyFormatter;
import demointerface.AppleFormatter;
import demointerface.ApplePredicate;
import demointerface.AppleSimpleFormatter;
import pojo.Apple;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author SiPingSoft
 * @create 2018-07-31 11:16
 */
public class Demo2 {





    public static List<Apple> filterApples (List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                apples.add(apple);
            }
        }
        return apples;
    }

    public static List<Apple> filterApples1 (List<Apple> inventory, ApplePredicate p) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                apples.add(apple);
            }
        }
        return apples;
    }

    public static void prettyPrintApple (List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {


        List<Apple> inventory = listApple();
        //prettyPrintApple(inventory, new AppleFancyFormatter());
        //prettyPrintApple(inventory, new AppleSimpleFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());

        Comparator<Apple> byWeight2 = Comparator.comparing(Apple::getWeight);

        inventory.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));


        inventory.sort(byWeight2);
        //System.out.println(inventory);
        //
        //
        //Predicate<Apple> p = Apple::isGreenApple;
        //
        //System.out.println(filterApples(inventory, (Apple a) -> "green".equals(a.getColor())));
        //
        //System.out.println(filterApples(inventory, Apple::isGreenApple));
        //System.out.println(filterApples(inventory, Apple::isWeightApple));


        //System.out.println(System.currentTimeMillis());
        //
        //List<Apple> apples1 = inventory.stream()
        //        .filter((apple -> "green".equals(apple.getColor())))
        //        .collect(Collectors.toList());
        //System.out.println(apples1.size());
        //System.out.println(System.currentTimeMillis());
        //
        //List<Apple> apples2 = inventory.parallelStream()
        //        .filter((apple -> "green".equals(apple.getColor())))
        //        .collect(Collectors.toList());
        //System.out.println(apples2.size());
        //
        //System.out.println(System.currentTimeMillis());

    }

    private static List<Apple> listApple() {

        List<Apple> inventory = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Apple apple = new Apple();
            int x = new Random().nextInt(2);
            if (x == 0) {
                apple.setColor("green");
            }else {
                apple.setColor("red");
            }
            apple.setWeight(new Random().nextInt(300));

            inventory.add(apple);
            apple = null;
        }
        return inventory;
    }


}
