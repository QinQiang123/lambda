package demo;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import okio.BufferedSink;
import okio.Okio;

import java.io.File;
import java.nio.charset.Charset;

/**
 * @author QinQiang
 * @description
 * @date 2019/8/28
 **/
public class Demo42 {
    public static void main(String[] args) throws Exception {

        String fileName = "D:/06_testfile/test.txt";
        File file = FileUtil.file(fileName);
        BufferedSink bufferedSink = Okio.buffer(Okio.sink(file));
        Console.log("===========数据开始写入===========");
        bufferedSink.writeString("12345", Charset.defaultCharset());
        bufferedSink.writeString("678910", Charset.defaultCharset());
        bufferedSink.close();
        Console.log("===========数据写入结束===========");
    }
}
