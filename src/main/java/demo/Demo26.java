package demo;

import java.util.Arrays;

/**
 * @description 在一个二维数据中查找某个数是否存在
 * @author QinQiang
 * @since 2018-12-27 15:43
 */
public class Demo26 {

    public static void main(String[] args) {
        int[][] arr = {{}, {}};


        System.out.println(find(3, arr));


    }

    public static boolean find(int target, int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).anyMatch(num -> num == target);
    }

}
