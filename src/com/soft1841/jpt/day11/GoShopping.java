package com.soft1841.jpt.day11;

public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "乐购";
        market.goods = "七匹狼西服";
        market.shop();
        market.name = "淘宝";
        market.goods="内存条";
    }
}
