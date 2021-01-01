package com.xie.Day04.Test01.Service;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client  {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",8888);
            OutputStream outputStream=socket.getOutputStream();
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            outputStream.write(s.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 