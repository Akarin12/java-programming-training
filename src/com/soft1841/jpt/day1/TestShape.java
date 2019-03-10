package com.soft1841.jpt.day1;

/**
 * 图形测试类
 *
 * @author Yue Tang
 * 2019.3.10
 */
public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.name = "圆形";
        System.out.println(circle.name + "面积：" + circle.getArea());
        Rectangle1 rectangle = new Rectangle1(5, 5);
        rectangle.name = "矩形";
        System.out.println(rectangle.name + "面积：" + rectangle.getArea());
    }
}
