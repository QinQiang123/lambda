package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 并行数据处理与性能
 * @author QinQiang
 * @since 2018-08-24 10:41
 */
public class Demo17 {
    public static void main(String[] args) {
        String str = "55555, 666";


        String[] str1 = str.split(",");
        System.out.println(Arrays.toString(str1));

        Arrays.stream(str1).collect(Collectors.toCollection(ArrayList::new));



    }
}
