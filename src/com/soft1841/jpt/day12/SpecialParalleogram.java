package com.soft1841.jpt.day12;

public class SpecialParalleogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond()};
        for (int i = 0; i < images.length; i++
        ) {
            images[i].draw();

        }
    }
}