package demo;

import cn.hutool.core.lang.Console;
import pojo.Apple;

import java.util.stream.IntStream;

/**
 * @author QinQiang
 * @description
 * @date 2019-07-30 10:48
 */
public class Demo41 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(1);
        IntStream.range(0, 5)
                .forEach(apple::setWeight);
        Console.log(apple);
    }
}
