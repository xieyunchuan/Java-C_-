package com.xie.Day02.排序;

import java.io.*;
import java.util.*;

public class Main{
    // 输入输出模板
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    public static void main(String[] args) throws IOException {
      //  n = Integer.parseInt(in.readLine());
        String s[] = in.readLine().split(" ");// 读入数据
        Arrays.sort(s, new Comparator<String>() { // 排序
            public int compare(String a, String b) {
                if(a.length() == b.length()){ // 如果长度相等则直接比较字典序
                    return a.compareTo(b);
                }
                else{ // 长度长的一定大
                    return a.length() - b.length();
                }
            }
        });

        for(String p : s){
            out.write(p+" ");
        }

        out.flush();
    }
}
