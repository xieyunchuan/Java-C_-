package com.xie.Day02.InputAndOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //快速输入
        StreamTokenizer in =new StreamTokenizer(new BufferedReader(new InputStreamReader(new FileInputStream("E:\\java_C数据结构\\Java-C_-\\数据结构和算法\\Java\\src\\com\\xie\\Day02\\InputAndOutput\\1.txt"))));

        //快速输出
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while(in.nextToken() != StreamTokenizer.TT_EOF){
            int a = (int) in.nval; // 获取一个整型数据
            out.println(a);
            out.flush();
        }
        StreamTokenizer streamTokenizer=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        streamTokenizer.nextToken();
        int str= (int) streamTokenizer.nval;//前提是首要的是一个字母才可以
        System.out.println(str);
    }
}