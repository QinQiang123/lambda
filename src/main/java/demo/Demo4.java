package demo;

import pojo.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author SiPingSoft
 * @create 2018-08-01 11:09
 */
public class Demo4 {

    public static void main(String[] args) {

        //Comparator<Apple> byWeight = Comparator.comparing(Apple::getWeight);
        //
        //Comparator<Apple> byWeight2 = Comparator.comparing(Apple::getWeight);


        List<String> stringList = Arrays.asList("X", "f", "A", "c", "H", "m");

        //stringList.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        stringList.sort(String::compareToIgnoreCase);

        System.out.println(stringList);



    }
}
