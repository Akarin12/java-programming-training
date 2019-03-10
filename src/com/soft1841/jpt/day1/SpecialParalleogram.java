package com.soft1841.jpt.day1;
/**
 * 画图形类
 *
 * @author Yue Tang
 * 2019.3.10
 */
public class SpecialParalleogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond()};
        for (int i = 0; i < images.length; i++
        ) {
            images[i].draw();

        }
    }
}