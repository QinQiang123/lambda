package demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QinQiang
 * @since 2018-10-23 17:57
 */
public class Demo29 {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("int", 1);
        map.put("tinyint", 1);
        map.put("bigint", 1);
        map.put("varchar", 2);
        map.put("char", 2);
        map.put("text", 2);
        map.put("data", 2);
        map.put("datatime", 2);

        System.out.println(map.get("int"));


    }
}
