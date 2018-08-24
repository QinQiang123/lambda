package demo;

import pojo.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static pojo.GetMenuList.getList;

/**
 *
 * 分组
 * @author QinQiang
 * @since 2018-08-23 15:34
 */
public class Demo15 {


    /**
     * 枚举
     */
    private enum CaloricLevel {DIET, NOEMAL, FAT};
    private static int[] LEVEL = {400, 700};


    public static void main(String[] args) {

        List<Dish> menu = getList();



        Map<Dish.Type, List<Dish>> dishesByType = menu.stream()
                .collect(groupingBy(Dish::getType));

        System.out.println(dishesByType);

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream()
                .collect(groupingBy(dish -> {
                    if (dish.getCalories() <= LEVEL[0]) {
                        return CaloricLevel.DIET;
                    }else if(dish.getCalories() <= LEVEL[1]) {
                        return CaloricLevel.NOEMAL;
                    }else {
                        return CaloricLevel.FAT;
                    }

                }));

        System.out.println(dishesByCaloricLevel);

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> typeMapMap = menu.stream()
                .collect(groupingBy(Dish::getType, groupingBy(dish -> {
                    if (dish.getCalories() <= LEVEL[0]) {
                        return CaloricLevel.DIET;
                    }else if(dish.getCalories() <= LEVEL[1]) {
                        return CaloricLevel.NOEMAL;
                    }else {
                        return CaloricLevel.FAT;
                    }

                })));
        typeMapMap.get(Dish.Type.OTHER).get(CaloricLevel.DIET).stream().min(Comparator.comparing(Dish::getCalories)).ifPresent(System.out::println);

        Map<Dish.Type, Dish> mostCaloricByType = menu.stream()
                .collect(groupingBy(Dish::getType, collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricByType);


    }
}
