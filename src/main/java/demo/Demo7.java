package demo;

import pojo.Dish;
import pojo.GetMenuList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author SiPingSoft
 * @create 2018-08-14 11:56
 */
public class Demo7 {

    public static void main(String[] args) {

        List<Dish> menu = GetMenuList.getList();
        //List<Dish> vegetarianDishes = menu.stream()
        //        .filter(dish -> dish.getType() == Dish.Type.MEAT)
        //        .limit(2)
        //        .collect(Collectors.toList());
        //System.out.println(vegetarianDishes);



        menu.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));




    }
}
