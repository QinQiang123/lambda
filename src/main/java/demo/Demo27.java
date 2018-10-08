package demo;

import java.util.function.Function;

/**
 * @author QinQiang
 * @since 2018-09-30 11:27
 */
public class Demo27 {

    public static void main(String[] args) {

         String a = "2018";


        Function<String, Integer> f = Integer::parseInt;


        System.out.println(f.apply(a));




   }
}
