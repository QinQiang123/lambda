package demo;

import cn.hutool.core.lang.Console;
import com.alibaba.fastjson.JSONPath;

import java.util.List;

/**
 * @author QinQiang
 * @description 测试fastjson中的JSONpath
 * @date 2019-06-10 9:22
 */
public class Demo36 {
    public static void main(String[] args) {

        //language=JSON
        String jsonStr = "[{\"x\":0,\"y\":0,\"w\":2,\"h\":10,\"i\":0,\"widgetId\":10,\"component\":\"echarts\",\"size\":{\"w\":530,\"h\":339}}]";
        List<Integer> read = (List<Integer>) JSONPath.read(jsonStr, "$..widgetId");
        Console.log(read);


    }
}
