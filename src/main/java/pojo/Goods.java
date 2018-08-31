package pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author QinQiang
 * @since 2018-08-31 9:02
 */
@Data
@EqualsAndHashCode
public class Goods {

    private String name;

    private Integer number;

    public Goods(String name, Integer number) {
        this.name = name;
        this.number = number;
    }
}
