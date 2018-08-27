package pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Optional;

/**
 * @author QinQiang
 * @since 2018-08-27 11:39
 */



@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Person {

    private Car car;

    private String name;

    private Integer age;

    private String address;

    public Optional<Car> getCarAsOptional() {
        return Optional.ofNullable(car);
    }

    public Person(Car car, String name, Integer age, String address) {
        this.car = car;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }
}
