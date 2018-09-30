package pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 专辑中的一支曲目
 * @author QinQiang
 * @since 2018-09-30 10:53
 */
@Data
@EqualsAndHashCode
public class Track {

    /**
     * 曲目名称
     */
    private String name;
}
