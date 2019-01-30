package pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author QinQiang
 * @description
 * @since 2019-01-11 10:18
 */

@Data
public class User extends BasePO{

    private Integer age;

    private String name;

    private Date createDate;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getCreateDate() {
        return createDate;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }


}
