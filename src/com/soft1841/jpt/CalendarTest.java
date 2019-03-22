package com.soft1841.jpt;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int mouth = calendar.get(calendar.MONTH);
        int day = calendar.get(calendar.DAY_OF_MONTH);
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        int minute = calendar.get(calendar.MINUTE);
        int second = calendar.get(calendar.SECOND);
        System.out.println("当前时间：" + year + "-" + mouth + "-" + day + "-" + hour + "-" + minute + "-" + second);
        Date date = calendar.getTime();
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间：" + date);
        System.out.println("当前毫秒数：" + time);
    }
}
