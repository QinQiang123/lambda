package demo;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Console;

/**
 * @author QinQiang
 * @description
 * @since 2019-07-02 9:17
 */
public class Demo28 {

    public static void main(String[] args) {
        Object s = 1.25;

        Console.log(Convert.toDouble(s));
    }
}
