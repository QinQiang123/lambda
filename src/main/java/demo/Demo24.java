package demo;

/**
 * 测试排序
 *
 * @author
 * @since 2018-12-19 16:31
 */
public class Demo24 {

    public static void main(String[] args) {

    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        int i, j;
        boolean flag = true;
        for (i = 0; i < arr.length && flag; i++) {
            flag = false;
            for (j = arr.length - 1; j >= i; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
        }
    }


    /**
     * 简单选择排序
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        int i, j, min;
        for (i = 0; i < arr.length; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    /**
     * 直接插入排序
     *
     * @param arr
     */
    public static void insertSort(int[] arr) {
        int i, j;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[0] = arr[i];
                for (j = i - 1; arr[j] > arr[0]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = arr[0];
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param arr
     */
    public static void shellSort(int[] arr) {
        int i, j;
        int increment = arr.length;
        do {
            increment = increment / 3 + 1;
            for (i = 0; i <= arr.length; i++) {
                if (arr[i] < arr[i - increment]) {
                    arr[0] = arr[i];
                    for (j = i - increment; j > 0 && arr[0] < arr[j]; j -= increment) {
                        arr[j + increment] = arr[j];
                    }
                    arr[j + increment] = arr[0];
                }
            }
        }
        while (increment > 1);
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
