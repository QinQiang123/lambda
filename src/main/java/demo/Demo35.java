package demo;

import cn.hutool.core.lang.Console;
import cn.miludeer.jsoncode.JsonCode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

/**
 * @author QinQiang
 * @description
 * @since 2019-05-29 10:14
 */
public class Demo35 {

    public static void main(String[] args) {

        //language=JSON
        String jsonStr = "{\"ss\":{\"sss\":\"vvvvv\",\"city\":{\"name\":\"上海\",\"list\":[\"1\",\"eeee\",\"33vsvg\"]}}}";
        String value = JsonCode.getValue(jsonStr, "$.ss.city.name");
        Console.log(value);
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        Object s = JSONPath.read(jsonStr, "$.ss.city.name");
        Console.log(s);


    }
}
