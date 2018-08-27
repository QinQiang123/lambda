package demo;

import pojo.Car;
import pojo.Insurance;
import pojo.Person;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author QinQiang
 * @since 2018-08-27 11:50
 */
public class Demo18 {

    private static Insurance insurance = new Insurance("hello");


    private static Car car = new Car("红旗", "123456", insurance);

    private static Person person = new Person(car, "张三", 25, "成都");

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        Car car3 = null;
        map.put("car", car);

        Object car4 = Optional.ofNullable(map.get("car")).orElseGet(Car::new);
        System.out.println(car4);



        BigDecimal price = new BigDecimal("100");

        price = Optional.ofNullable(price).orElseGet(() -> new BigDecimal("0"));

        System.out.println(price);

        Car car1 = new Car();
        Car car2 = person.getCar();
        Optional<Person> optionalPerson = Optional.of(person);
        Optional<Car> optionalCar = person.getCarAsOptional();
        Optional<String> carName = optionalCar.map(Car::getCarName);
        Optional<String> name = optionalPerson.map(Person::getCar).map(Car::getInsurance).map(Insurance::getName);

        System.out.println(name);


        System.out.println(stringToInteger("aaa").get());


    }



    public static Optional<Integer> stringToInteger(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.of(1);
        }
    }
}
