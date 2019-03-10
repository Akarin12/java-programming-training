package com.soft1841.jpt.day1;

public class Elf implements Move, Sing {
    @Override
    public String sing() {
        return "唱歌";
    }

    @Override
    public String move() {
        return "跳舞";
    }

    public static void main(String[] args) {
        Elf elf = new Elf();
        System.out.println("精灵一边" + elf.sing() + "，一边" + elf.move());
    }
}
