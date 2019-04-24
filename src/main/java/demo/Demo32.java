package demo;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import pojo.Dish;
import pojo.GetMenuList;

import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-25 11:04
 */
public class Demo32 {


    public static void main(String[] args) {
        Iterable<String> split = Splitter.on(",").trimResults().split("1, 1, 1");
        split.forEach(System.out::println);

        //List<Dish> list = GetMenuList.getList();
        //
        //Map<String, Dish> collect = list.stream().collect(Collectors.toMap(Dish::getName, e -> e));
        //System.out.println(collect.get("season fruit").getCalories());
    }
}
