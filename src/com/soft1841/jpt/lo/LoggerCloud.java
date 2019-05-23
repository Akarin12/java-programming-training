package com.soft1841.jpt.lo;

public class LoggerCloud implements Logger {
    @Override
    public void log(String messsage){
        System.out.println("日志输出到云平台"+ messsage);
    }
}