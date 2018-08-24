package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SiPingSoft
 * @create 2018-08-14 9:27
 */
public class GetMenuList {

    public static List<Dish> getList() {
        List<Dish> menu = new ArrayList<>();

        menu.add(new Dish("pork",false, 800, Dish.Type.MEAT));
        menu.add(new Dish("beef",false, 700, Dish.Type.MEAT));
        menu.add(new Dish("chicken",false, 400, Dish.Type.MEAT));
        menu.add(new Dish("french fries",false, 530, Dish.Type.OTHER));
        menu.add(new Dish("rice",true, 350, Dish.Type.OTHER));
        menu.add(new Dish("season fruit",true, 130, Dish.Type.OTHER));
        menu.add(new Dish("pizza",true, 550, Dish.Type.OTHER));
        menu.add(new Dish("prawns",false, 300, Dish.Type.FISH));
        menu.add(new Dish("salmon",false, 450, Dish.Type.FISH));

        return menu;
    }

}
