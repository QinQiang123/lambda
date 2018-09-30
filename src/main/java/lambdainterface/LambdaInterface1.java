package lambdainterface;

/**
 * @author QinQiang
 * @since 2018-09-30 11:24
 */
@FunctionalInterface
public interface LambdaInterface1<R, T, Q> {
    void test (R r, T t, Q q);
}
