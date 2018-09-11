package demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QinQiang
 * @since 2018-09-06 14:46
 */
public class Demo23 {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>(16);


        map.put("num1", 1);
        map.put("num2", 2);
        map.put("num3", 3);
        map.put("num4", 4);
        map.put("num5", 5);
        map.put("num6", 6);

        map.forEach((key, value) -> {
            if ("num2".equals(key)) {
                System.out.println(value);
            }
           /* System.out.println(key);
            System.out.println(value);*/
        });
        System.out.println("这是一段测试代码！");

        System.out.println("这是一段分支代码！");
        System.out.println("这是一段分支代码！");
        System.out.println("这是一段分支代码！");

    }
}
