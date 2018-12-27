package pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @since 2018-12-25 16:00
 */
@Data
public class Test {

    private  Apple apple = new Apple();

    private  List<Person> people = new ArrayList<>();

    public void getInstance() {
        apple.setColor("red");
        apple.setWeight(50);

        Person person1 = new Person();
        Person person2 = new Person();
        person1.setAge(60);
        person2.setAge(40);

        people.add(person1);
        people.add(person2);
    }

}
