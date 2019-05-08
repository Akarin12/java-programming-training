package com.soft1841.jpt.severClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main (String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(11451);
        System.out.println("服务器启动，端口号:"+ss.getLocalPort());
        while (true){
            Socket socket=ss.accept();
            System.out.println("客户端："+socket.getInetAddress()+"上线了");
            socket.close();
        }
    }
}