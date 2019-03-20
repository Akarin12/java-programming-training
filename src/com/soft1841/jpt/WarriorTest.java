package com.soft1841.jpt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * comparebale接口
 * 2019.3.20
 *
 * @author Yue Tang
 */
public class WarriorTest {
    public static void main(String[] args) {
        List<Warrior> list = new ArrayList<>();
        list.add(new Warrior("杨俣韬", 1));
        list.add(new Warrior("梅梅杰", 2));
        list.add(new Warrior("陈晨", 10));
        list.add(new Warrior("张龙龙", 5));

        Collections.sort(list);

        for (Warrior warrior : list) {
            System.out.println("姓名：" + warrior.getName() + "    战斗力：" + warrior.getPower());
        }
    }
}
