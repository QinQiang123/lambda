package demo;

import pojo.User;


import java.util.Date;

import static java.util.Optional.*;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-11 10:18
 */
public class Demo29 {

    public static void main(String[] args) {

        User user = new User();

        user.setName("qinqiang").setAge(25).setCreateDate(new Date());
/*
        ofNullable(user.getAge()).orElseGet(() -> {
            user.setAge(255);
            return 1;
        });*/

        System.out.println(user);

    }
}
