package com.soft1841.jpt.day34;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.bilibili.com/video/av52106422/?spm_id_from=333.334.b_63686965665f7265636f6d6d656e64.17");
            System.out.println("URL为：" + url.toString());
            System.out.println("协议为："+url.getProtocol());
            System.out.println("验证信息：" +url.getAuthority());
            System.out.println("文件名及请求参数：" +url.getFile());
            System.out.println("主机名："  + url.getHost());
            System.out.println("路径：" +url.getPath());
            System.out.println("端口：" +url.getPort());
            System.out.println("默认端口：" + url.getDefaultPort());
            System.out.println("请求参数：" + url.getQuery());
            System.out.println("定位位置：" +url.getRef());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}