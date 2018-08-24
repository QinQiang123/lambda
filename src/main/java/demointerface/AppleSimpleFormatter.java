package demointerface;

import pojo.Apple;

/**
 * @author SiPingSoft
 * @create 2018-07-31 14:39
 */
public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
