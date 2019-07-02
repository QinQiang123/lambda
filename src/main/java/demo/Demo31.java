package demo;


import demointerface.TestInterface;
import pojo.User;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-15 16:02
 */
public class Demo31 {

    public static void main(String[] args) {
        String s = "1";
        StringBuilder builder = new StringBuilder(s);
        builder.append("2");
        builder.insert(1, "3");
        String s1 = "";
        System.out.println(s1);
        System.out.println(builder.toString());
        boolean b = s.contentEquals(s1);
        System.out.println(b);
        String substring = s.substring(1);
        System.out.println(substring);

        User user1 = TestInterface.collect(() -> {
            User user = new User();
            user.setName("111");
            return user;
        });
    }


}
