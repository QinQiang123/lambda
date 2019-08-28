package utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.ReflectUtil;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author QinQiang
 * @description bean对象的一些工具方法
 * @date 2019/8/27
 **/
public class BeanUtils {
    /**
     * 对象转换的新实现
     * @param source 源
     * @param destinationClass 目标class
     * @param <T> 目标对象类型
     * @return 目标对象
     */
    public static <T> T map(Object source, Class<T> destinationClass) {
        T t = ReflectUtil.newInstance(destinationClass);
        BeanUtil.copyProperties(source, t);
        return t;

    }

    /**
     * 添加复制对象属性的重载方法
     * @param source
     * @param destinationClass
     * @param ignoreFields 需要忽略的属性
     * @param <T>
     * @return
     */
    public static <T> T map(Object source, Class<T> destinationClass, String... ignoreFields) {
        CopyOptions copyOptions = CopyOptions.create().setIgnoreProperties(ignoreFields);
        T t = ReflectUtil.newInstance(destinationClass);
        BeanUtil.copyProperties(source, t, copyOptions);
        return t;

    }

    /**
     * 集合对象复制
     * @param sourceList
     * @param destinationClass
     * @param <T>
     * @return
     */
    @SuppressWarnings("all")
    public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        return (List<T>) sourceList.stream()
                .map(ob -> map(ob, destinationClass))
                .collect(toList());
    }
}
