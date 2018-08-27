package pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author QinQiang
 * @since 2018-08-27 13:55
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Insurance {

    private String name;

    public Insurance(String name) {
        this.name = name;
    }

    public Insurance() {
    }
}
