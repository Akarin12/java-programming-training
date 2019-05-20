package com.soft1841.jpt;

public class SingletonTest {
    public static void main(String[] args) {
        //编译错误，因为构造方法不是可见的，只能在singleton类内部使用
        // Singleton object = new Singleton();

        //通过singleton的类方法singleton.getInstance() 获取唯一可用的对象
        Singleton object = Singleton.getInstance();
        //显示消息
        object.showMessage();
    }
}

class Singleton {
    //创建 singleton 的一个对象
    private static  Singleton instance = new Singleton();
    //让构造方法为 private ,这样该类就不会被实例化
    private Singleton(){

    }
    //静态方法获取唯一可用对象
    public  static Singleton getInstance(){
        return instance;
    }
    //成员方法，显示消息
    public void showMessage(){
        System.out.println("I am inevitable");
    }
}