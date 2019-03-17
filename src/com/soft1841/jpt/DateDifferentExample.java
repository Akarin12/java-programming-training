package com.soft1841.jpt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算两时间差
 *
 * @author Yue Tang
 * 2019.3.18
 */
public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-03-16 7:03:23";
        String stopTime = "2019-03-17 16:01:23";
        String minTime = "2019-03-18 07:00:02";
        String ggTime = "2019-03-18 07:34:29";
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时间：" + format.format(date));
        Date d1;
        Date d2;
        Date d3;
        long diff = 0;
        long fi1 = 0;
        long fi2 = 0;
        //通过SimpleDateFormat的对象来把String类型的时间对象转化成Date类型的对象
        try {
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            d3 = format.parse(minTime);
            //毫秒ms的差值
            diff = date.getTime() - d1.getTime();
            fi1 = date.getTime() - d2.getTime();
            fi2 = date.getTime() - d3.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diffMinutes = fi2 / (1000 * 60);
        long diffHours = fi1 / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 * 60 * 24);
        System.out.println(startTime + "   " + Math.abs(diffDays) + "天前");
        System.out.println(stopTime + "   " + Math.abs(diffHours) + "小时前");
        System.out.println(minTime + "   " + Math.abs(diffMinutes) + "分钟前");
        System.out.println(ggTime + "   " + "刚刚");
    }
}
