package demo;

import pojo.Goods;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static pojo.GoodsList.getGoodsList;

/**
 * 将目标对象进行分组，统计其中名称相同商品的数量
 * @author QinQiang
 * @since 2018-08-31 9:17
 */
public class Demo22 {
    public static void main(String[] args) {

        List<Goods> goodsList = getGoodsList();

        Map<String, Integer> nameMap = goodsList.stream()
                .collect(groupingBy(Goods::getName, summingInt(Goods::getNumber)));


        System.out.println(nameMap);
        System.out.println("这是一个分支管理");
        System.out.println("这是一个分支管理");
        System.out.println("这是一个分支管理");
        System.out.println("这是一个分支管理");
        System.out.println("这是一个分支管理");

        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);

    }
}
