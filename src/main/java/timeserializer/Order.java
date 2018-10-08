package timeserializer;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @author QinQiang
 * @since 2018-10-08 9:09
 */
@Data
@EqualsAndHashCode
@ToString
public class Order {


    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime payTime;
}
