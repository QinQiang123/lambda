package demo;

import java.util.Optional;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

/**
 * @author QinQiang
 * @since 2018-08-27 15:45
 */
public class Demo19 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("a", "5");
        properties.setProperty("b", "true");
        properties.setProperty("c", "-3");

        assertEquals(5, readDuration(properties, "a"));
        assertEquals(0, readDuration(properties, "b"));
        assertEquals(0, readDuration(properties, "c"));

    }

    public static int readDuration(Properties properties, String name) {

        try {
            return Integer.parseInt(Optional.ofNullable(properties.getProperty(name)).filter(n -> Integer.parseInt(n) > 0).orElse("0"));
        } catch (NumberFormatException e) {
            return 0;
        }

    }





}
