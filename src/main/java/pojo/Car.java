package pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author QinQiang
 * @since 2018-08-27 11:38
 */

@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Car {

    private String carName;

    private String carNo;

    private Insurance insurance;

    public Car(String carName, String carNo, Insurance insurance) {
        this.carName = carName;
        this.carNo = carNo;
        this.insurance = insurance;
    }

    public Car() {
    }
}
