package demo;

import pojo.Dish;
import static pojo.GetMenuList.getList;
import static  java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

/**
 *
 * 流的规约和汇总
 * @author QinQiang
 * @since 2018-08-23 9:20
 */
public class Demo14 {

    public static void main(String[] args) {
        List<Dish> menu = getList();
        long howManyDishes = menu.stream().collect(counting());
        long howManyDishes1 = menu.stream().count();


        System.out.println(howManyDishes1);

        System.out.println(howManyDishes);

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);


        Optional<Dish> mostCalorieDish = menu.stream().collect(maxBy(dishCaloriesComparator));

        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));

        IntSummaryStatistics summaryStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));


        System.out.println(summaryStatistics);

        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));

        System.out.println(shortMenu);

        int totalCalories2 = menu.stream().collect(reducing(0, Dish::getCalories, (i , j)-> i + j));

        System.out.println(totalCalories2);


        Optional<Dish> optionalDish = menu.stream()
                .collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        optionalDish.ifPresent(dish -> System.out.println(dish));

    }

}
