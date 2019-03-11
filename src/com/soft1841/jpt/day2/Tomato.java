package com.soft1841.jpt.day2;

import java.util.Scanner;

/**
 * 异常处理
 *
 * @author Yue Tang
 * 2019.3.11
 */

public class Tomato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("今天的西红柿单价（单价格式为“3.00）：");
        String dayPrice = scanner.next();
        if (dayPrice.length() == 4) {
            try {
                String message = "西红柿：" + dayPrice + "元/500g";
                String[] strArr = message.split(":");
                String unitPriceStr = strArr[2].substring(0, 4);
                double weight = 650;
                double unitPriceStrDou = Double.parseDouble(unitPriceStr);
                System.out.println(message + "，顾客购买了" + weight + "g西红柿，需支付" + (float) (weight / 500 * unitPriceStrDou) + "元");
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                aiobe.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                scanner.close();
                System.out.println("控制台对象被关闭");
            }
        } else {
            System.out.println("违规操作：输入的西红柿单价时小数点后须保留两位小数！");
        }
    }
}
