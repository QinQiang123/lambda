package demo;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;

import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-25 11:04
 */
public class Demo32 {

    private static final Joiner JOINER = Joiner.on(", ").skipNulls();

    public static void main(String[] args) {

        List<String> strings = Lists.newArrayList();

        strings.add("xxx1");
        strings.add("xxx2");
        strings.add("xxx3");
        strings.add("xxx4");

        String collect = strings.stream()
                .map("u."::concat)
                .collect(Collectors.joining(", "));

        String join = JOINER.join(strings);
        System.out.println(collect);
        System.out.println(join);

        int a = 10;

        int b = 3;

        System.out.println(IntMath.divide(a, b, RoundingMode.UP));

        System.out.println(IntMath.gcd(12, 20));

    }
}
