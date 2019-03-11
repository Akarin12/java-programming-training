package com.soft1841.jpt.day1;

/**
 * @author Yue Tang
 * 2019.3.10
 */

public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "乐购";
        market.goods = "七匹狼西服";
        market.shop();
        market  =new TaobaoMarket();
        market.name = "淘宝";
        market.goods="内存条";
        market.shop();
    }
}
