package demointerface;

import pojo.Apple;

/**
 * @author SiPingSoft
 * @create 2018-07-31 14:30
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
