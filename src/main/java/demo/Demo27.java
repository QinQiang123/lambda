package demo;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.extra.tokenizer.TokenizerEngine;
import cn.hutool.extra.tokenizer.TokenizerUtil;
import cn.hutool.extra.tokenizer.Word;

import java.util.Iterator;

/**
 * @author QinQiang
 * @since 2018-09-30 11:27
 */
public class Demo27 {

    public static void main(String[] args) {
        //LambdaInterface1<String, String, String> lambdaInterface1 = (a, b, c) -> System.out.println(a + b + c);
        //lambdaInterface1.test("11", "22", "33");
        TokenizerEngine engine = TokenizerUtil.createEngine();

        //解析文本
        String text = "这两个方法的区别在于返回值";
        Result result = engine.parse(text);
        //输出：这 两个 方法 的 区别 在于 返回 值
        String resultStr = CollUtil.join((Iterator<Word>) result, " ");
        Console.log(resultStr);
    }
}
