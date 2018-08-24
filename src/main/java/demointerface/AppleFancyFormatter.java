package demointerface;

import pojo.Apple;

/**
 * @author SiPingSoft
 * @create 2018-07-31 14:38
 */
public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
