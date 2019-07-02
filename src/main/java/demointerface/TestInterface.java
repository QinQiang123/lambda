package demointerface;

import java.util.function.Supplier;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-24 17:12
 */
public class TestInterface {

    public static <R> R collect(Supplier<R> supplier) {
        return supplier.get();
    }
}
