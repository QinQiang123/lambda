package demo;

import lambdainterface.LambdaInterface1;

/**
 * @author QinQiang
 * @since 2018-09-30 11:27
 */
public class Demo27 {

    public static void main(String[] args) {
        LambdaInterface1<String, String, String> lambdaInterface1 = (a, b ,c) -> System.out.println(a + b +c);
        lambdaInterface1.test("11", "22", "33");
    }
}
