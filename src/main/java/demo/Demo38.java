package demo;

import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.ReUtil;

import java.util.regex.PatternSyntaxException;

/**
 * @author QinQiang
 * @description 测试过滤非法字符
 * @date 2019-07-15 9:40
 */
public class Demo38 {
    public static void main(String[] args) {
        String str = "*adCVs*34_a _09_b5*[/435^*&城池()^$$&*).{}+.|.)%%*(*.中国}34{45[]12.fd'*&999下面是中文的字符￥……{}【】。，；’“‘”？";
        String s = "s f";
        Console.log(StringFilter(s));

    }

    // 过滤特殊字符
    public static String StringFilter(String str) throws PatternSyntaxException {
        // 只允许字母和数字 // String regEx = "[^a-zA-Z0-9]";
        // 清除掉所有特殊字符
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        String reg = "^[a-z0-9A-Z_]+$";
        Console.log(Validator.isMactchRegex(reg, str));
        String s = ReUtil.replaceAll(str, regEx, "");
        return ReUtil.replaceAll(s, "(\\s+)", "_");
    }
}
