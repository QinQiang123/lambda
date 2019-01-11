package demo;

import pojo.User;


import static java.util.Optional.*;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-11 10:18
 */
public class Demo29 {

    public static void main(String[] args) {

        User user = new User();

        user.setName("qinqiang");

        ofNullable(user.getAge()).orElseGet(() -> {
            user.setAge(255);
            return 1;
        });

        System.out.println(user);

    }
}
