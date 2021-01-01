package com.xie.Day04.Test01.Service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Service {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(1056);
            System.out.println(serverSocket.getInetAddress()+":"+serverSocket.getLocalPort());
            ArrayList<Socket> sockets=new ArrayList<Socket>(10);
            int flag=0;
            while(flag!=-1){
                Socket socket=serverSocket.accept();
                System.out.println("接受到"+socket.getInetAddress()+"的连接");
                sockets.add(socket);
                socket=null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 