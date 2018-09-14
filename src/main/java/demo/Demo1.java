package demo;

import java.io.File;
import java.io.FileFilter;

/**
 * @author SiPingSoft
 * @create 2018-07-31 11:05
 */
public class Demo1 {



    public static void main(String[] args) {
        /**
         * 判断隐藏文件的两种方式
         */
        File[] hiddenFiles1 = new File(".'").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });

        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);

        System.out.println(hiddenFiles1);
        System.out.println(hiddenFiles2);
        System.out.println(111111);
        System.out.println(111111);
        System.out.println(111111);
        System.out.println(111111);
        System.out.println(hiddenFiles2);
        System.out.println(hiddenFiles2);
        System.out.println(hiddenFiles2);
        System.out.println(hiddenFiles2);
        System.out.println(hiddenFiles2);


    }
}
