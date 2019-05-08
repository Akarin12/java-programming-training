package com.soft1841.jpt.severClient;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main (String[] args)throws IOException {
        Socket socket=new Socket("10.40.173.120",11451);
        System.out.println("已和服务器建立联系，远程主机地址："+socket.getRemoteSocketAddress());
    }
}