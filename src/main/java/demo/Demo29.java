package demo;

import pojo.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author QinQiang
 * @since 2018-10-23 17:57
 */
public class Demo29 {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("int", 1);
        map.put("tinyint", 1);
        map.put("bigint", 1);
        map.put("varchar", 2);
        map.put("char", 2);
        map.put("text", 2);
        map.put("data", 2);
        map.put("datatime", 2);

        System.out.println(map.get("int"));


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
