package com.soft1841.jpt.day1;

/**
 * 画图形接口
 *
 * @author Yue Tang
 * 2019.3.10
 */
interface DrawImage {
    public void draw();
}

class Rectangle implements DrawImage {
    public void draw() {
        System.out.println("画矩形");
    }
}

class Square implements DrawImage {
    public void draw() {
        System.out.println("画正方形");
    }
}

class Diamond implements DrawImage {
    public void draw() {
        System.out.println("画菱形");
    }
}

