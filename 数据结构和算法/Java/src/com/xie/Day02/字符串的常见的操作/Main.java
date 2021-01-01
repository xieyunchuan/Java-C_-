package com.xie.Day02.字符串的常见的操作;

public class Main {
    public static void main(String[] args) {
        String s="xx xy yxx zz";
        System.out.println(s.indexOf("xyy")+1);//返回实际这个子串的开始位置
        System.out.println(s.indexOf("xx",3));//返回的是从开头的位置开始算
        String s1=s.replaceAll("x","s");//replaceAll(String s1,String s2);//用s2替换目标字符串中出现的所有s1
        System.out.println(s1);
        s1=s.replaceFirst("y","x");
        System.out.println(s1);
        String s2[] = s.split(" ");
        System.out.println(s2.length);

    }
} 