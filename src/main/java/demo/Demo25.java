package demo;

import pojo.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @since 2018-12-25 16:05
 */
public class Demo25 {
    public static void main(String[] args) {
        Test test1 = new Test();
        test1.getInstance();
        Test test2 = new Test();
        test2.getInstance();
        Test test3 = new Test();
        test3.getInstance();

        List<Test> tests = new ArrayList<>();

        tests.add(test1);
        tests.add(test2);
        tests.add(test3);


        Integer sum = tests.stream().map(test -> test.getApple()).mapToInt(s -> s.getWeight()).sum();
        System.out.println(sum);


        Integer sum2 = tests.stream().flatMap(test -> test.getPeople().stream()).mapToInt(s -> s.getAge()).sum();

        System.out.println(sum2);


    }
}
