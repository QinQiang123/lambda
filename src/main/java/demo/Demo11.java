package demo;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author SiPingSoft
 * @since 2018-08-15 14:03
 */
public class Demo11 {

    public static void main(String[] args) {


        Stream<String> stream = Stream.of("Java 8", "Lambda", "In", "Action");
        stream.map(String::toLowerCase).forEach(System.out::println);

        Stream<String> emptyStream = Stream.empty();

        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();
        System.err.println(sum);


        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(Paths.get("D:/data.txt"), Charset.defaultCharset())) {

            //lines.forEach(System.out::println);
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split("")))
                    .filter(s -> "d".equals(s))
                    .count();
            System.out.println(uniqueWords);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
