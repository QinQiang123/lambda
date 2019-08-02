package demo;

import cn.hutool.core.lang.Console;

@FunctionalInterface
interface TestInterface<T, A, B, C> {
    T test(A a, B b, C c);

    default int get() {
        return 0;
    }
}

/**
 * @author QinQiang
 * @description
 * @since 2019-02-19 11:07
 */
public class Demo33 {

    public static void main(String[] args) {
        TestInterface<Integer, Integer, Integer, Integer> testInterface = (a, b, c) -> a + b + c;
        System.out.println(testInterface.test(1, 2, 3));
        Console.log(testInterface.get());

    }
}
