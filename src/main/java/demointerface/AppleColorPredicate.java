package demointerface;

import pojo.Apple;

/**
 * @author SiPingSoft
 * @create 2018-07-31 14:31
 */
public class AppleColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
