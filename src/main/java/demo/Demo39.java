package demo;

import pojo.Apple;

import java.util.Optional;

/**
 * @author QinQiang
 * @description 测试使用optional
 * @date 2019-07-22 10:08
 */
public class Demo39 {
    public static void main(String[] args) {
        Optional<Apple> apple = Optional.empty();


        Integer weiget = apple.map(Apple::getWeight)
                .get();
    }
}
