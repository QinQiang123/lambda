package demo;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author QinQiang
 * @description
 * @since 2018-12-27 15:46
 */
public class Demo27 {

    public static void main(String[] args) {
        List<Map<String, BigDecimal>> mapList  = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Map<String, BigDecimal> map = new HashMap<>();
            map.put("1", new BigDecimal(1));
            map.put("2", new BigDecimal(2));
            map.put("3", new BigDecimal(3));
            map.put("4", new BigDecimal(4));
            mapList.add(map);
        }

       BigDecimal bigDecimal = mapList.stream()
                .flatMap(s -> s.entrySet().stream())
                .filter(s -> Objects.equals("2", s.getKey()))
                .map(Map.Entry::getValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);



        System.out.println(bigDecimal);

    }
}
