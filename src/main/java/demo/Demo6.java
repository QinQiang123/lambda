package demo;



import pojo.Dish;

import java.util.Comparator;
import java.util.List;

import static pojo.GetMenuList.getList;
import static java.util.stream.Collectors.toList;
/**
 * @author SiPingSoft
 * @create 2018-08-14 9:27
 */
public class Demo6 {

    public static void main(String[] args) {
        List<Dish> menu = getList();

        List<String> threeHighCaloricDishNames = menu.stream()
                .filter(d -> {
                    System.out.println("filtering" + d.getName());
                    return d.getCalories() > 300;
                })
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(d -> {
                    System.out.println("mapping" + d.getName());
                      return  d.getName();
                })
                .limit(3)
                .collect(toList());
        System.out.println(threeHighCaloricDishNames);
    }




}
