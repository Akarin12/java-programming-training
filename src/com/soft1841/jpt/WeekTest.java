package com.soft1841.jpt;

import java.util.Scanner;

/**
 * 枚举练习
 * @author Yue Tang
 * 2019.3.21
 */

enum Week{
monday("星期一"),tuesday("星期二"),wednesday("星期三"),thursday("星期四"),friday("星期五"),saturday("星期六"), sunday("星期日");
String week;

    Week(String week) {
        this.week = week;
    }

    public String getName() {
        return week;
    }

    public static Week getWeek(String week) {
        switch (week) {
            case "mon":
                return Week.monday;
            case "tues":
                return Week.tuesday;
            case "wed":
                return Week.wednesday;
            case "thru":
                return Week.thursday;
            case "fri":
                return Week.friday;
            case "sat":
                return Week.saturday;
            case "sun":
                return Week.sunday;
            default:
                return Week.monday;
        }
    }
}

public class WeekTest {
    public static void main(String[] args) {
        System.out.println("\n请输入要查询的英文星期简写(小写)：");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Week week = Week.getWeek(sc.next());
            switch (week) {
                case monday:
                    System.out.println("MONDAY————" + week.getName());
                    break;
                case tuesday:
                    System.out.println("TUESDAY——" + week.getName());
                    break;
                case wednesday:
                    System.out.println("WEDNESDAY——" + week.getName());
                    break;
                case thursday:
                    System.out.println("THURSDAY——" + week.getName());
                    break;
                case friday:
                    System.out.println("FRIDAY——" + week.getName());
                    break;
                case saturday:
                    System.out.println("SATURDAY——" + week.getName());
                    break;
                case sunday:
                    System.out.println("SUNDAY——" + week.getName());
                    break;
                default:
                    System.out.println("您的输入有误！");
                    break;
            }
        }
        sc.close();
    }
}