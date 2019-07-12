package demo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author QinQiang
 * @description 测试fastjson中的JSONpath
 * @date 2019-06-10 9:22
 */
public class Demo36 {
    public static void main(String[] args) {
        Map<String, Object> map = Maps.newHashMap();
        Map<String, Object> map1 = Maps.newHashMap();
        map.put("a", 1);
        map1.put("b", 2);
        map.put("c", map1);
        Object a = BeanUtil.getProperty(map, "c.b");
        Console.log(a);
    }
}
