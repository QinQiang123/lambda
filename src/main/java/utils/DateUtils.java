package utils;

import cn.hutool.core.date.DateUtil;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.jetbrains.annotations.Contract;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author QinQiang
 * @description 保存一些常用的日期工具方法
 * @date 2019/8/27
 **/
public class DateUtils {

    /**
     * 获取两个日期之间的时间段，以天为间隔
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return 时间间隔的集合
     */
    @org.jetbrains.annotations.NotNull
    public static List<Map<String, Date>> splitDate(Date startTime, Date endTime) {
        List<Map<String, Date>> maps = Lists.newArrayList();
        Date newEndTime;
        Date newStartTime = startTime;
        long day = DateUtil.betweenDay(startTime, endTime, true);
        for (int i = 0; i <= day; i++) {
            if (newStartTime.getTime() > endTime.getTime()) {
                break;
            }
            newEndTime = DateUtil.offsetSecond(DateUtil.offsetDay(newStartTime, 1), -1);
            if (newEndTime.getTime() > endTime.getTime()) {
                newEndTime = endTime;
            }
            Map<String, Date> map = Maps.newHashMap();
            map.put("startTime", newStartTime);
            map.put("endTime", newEndTime);
            maps.add(map);
            newStartTime = DateUtil.offsetDay(newStartTime, 1);
        }
        return maps;
    }

    /**
     * 判断一个String是否可以转换为日期
     * @param dest
     * @return
     */
    @Contract(pure = true)
    public static boolean isDateFormat(String dest) {

        return true;
    }
}
