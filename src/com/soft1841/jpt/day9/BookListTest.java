package com.soft1841.jpt.day9;

import java.util.ArrayList;
import java.util.List;

public class BookListTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(510,"他改变了中国",22.5));
        list.add(new Book(1,"大苏打撒阿斯顿",114.0));
        list.add(new Book(202,"奥迪看到烦烦烦",55.6));
        list.add(new Book(8520,"尔萨防护网确认",63.0));
        System.out.println(list);

        list.add(2,new Book(853,"俺是个呃呃",99.3));
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(2,new Book(999,"皮卡帕啊发",10.5));
        System.out.println(list);
        System.out.println(list.get(1));

        list.add(new Book(1,"大苏打撒阿斯顿",114.0));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(1,"大苏打撒阿斯顿",114.0)));
        System.out.println(list.lastIndexOf(new Book(1,"大苏打撒阿斯顿",114.0)));
    }
}
