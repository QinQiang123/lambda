package demo;

import pojo.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-11 10:18
 */
public class Demo29 {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user1.setName("qinqiang1")
                .setAge(25);
        user2.setName("qinqiang2")
                .setAge(26);
        user3.setName("qinqiang3")
                .setAge(27);
        user4.setName("qinqiang4")
                .setAge(28);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        List<User> collect = users.stream()
                .map(user -> new User() {{
                    setAge(user.getAge())
                            .setName(user.getName())
                            .setGmtCreate(new Date())
                            .setGmtModified(user.getGmtModified());
                }}).collect(Collectors.toList());

        Integer length = users.size();

        IntStream.rangeClosed(0, length - 1)
                .forEach(i -> {
                    if (Objects.equals(i, length - 1)) {
                        users.get(i).setAge(26);
                    }
                    System.out.println(users.get(i));

                });

        System.out.println(collect);
    }
}
