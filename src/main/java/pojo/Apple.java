package pojo;

/**
 * @author SiPingSoft
 * @create 2018-07-31 11:15
 */
public class Apple {

    private String color;

    private Integer weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    public static boolean isGreenApple (Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isWeightApple (Apple apple) {
        return apple.getWeight() > 150;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
