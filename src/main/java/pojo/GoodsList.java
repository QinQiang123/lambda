package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QinQiang
 * @since 2018-08-31 9:14
 */
public class GoodsList {

    public static List<Goods> getGoodsList() {
        List<Goods> goodsList = new ArrayList<>();

        goodsList.add(new Goods("Apple", 1));
        goodsList.add(new Goods("Apple", 2));
        goodsList.add(new Goods("Apple", 3));
        goodsList.add(new Goods("Pear", 1));
        goodsList.add(new Goods("Pear", 5));
        goodsList.add(new Goods("Pear", 6));
        goodsList.add(new Goods("Pear", 2));
        goodsList.add(new Goods("Banana", 1));
        goodsList.add(new Goods("Banana", 2));
        goodsList.add(new Goods("Banana", 5));

        return goodsList;
    }
}
