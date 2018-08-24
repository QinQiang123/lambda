package demo;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;
import java.util.function.Function;

/**
 * @author SiPingSoft
 * @create 2018-08-02 11:12
 */
public class Demo5 {

    public static void main(String[] args) {
        //Callable<Integer> c = () -> 42;
        //PrivilegedAction<Integer> p = () -> 42;
        //
        //int num = 50;
        //
        //Runnable r = () -> System.out.println(num);


        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g);
        Function<Integer, Integer> i = f.compose(g);


        Integer m = i.apply(4);
        Integer n = h.apply(4);

        System.out.println(m);
        System.out.println(n);

    }



}
