package com.xie.Day02.InputAndOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInPutTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\java_C数据结构\\Java-C_-\\数据结构和算法\\Java\\src\\com\\xie\\Day02\\InputAndOutput\\1.txt")));
        String strin = in.readLine();
        System.out.println(strin);


    }
} 