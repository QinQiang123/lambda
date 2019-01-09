package demo;

import com.google.common.collect.Lists;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 *
 * @author QinQiang
 * @description
 * @since 2018-12-27 15:46
 */
public class Demo27 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        Month month = localDate.getMonth();

        System.out.println(month.getValue());
        System.out.println(localDate.getMonthValue());

        List<Integer> integers = Lists.newArrayList();
        System.out.println(integers.isEmpty());

    }
}
