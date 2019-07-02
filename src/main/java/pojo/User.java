package pojo;

import cn.hutool.core.clone.CloneSupport;
import lombok.Getter;
import lombok.Setter;

/**
 * @author QinQiang
 * @description
 * @since 2019-07-01 13:52
 */
@Getter
@Setter
public class User extends CloneSupport<User> {

    private String name;

    private Integer age;

    private String sex;

}
