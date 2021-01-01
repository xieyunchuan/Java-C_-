package com.xie.Day02.基础算法.搜索算法.DFS;

import java.io.IOException;

public class Main{
    public  static int f(int n){
        if(n == 0){
            return n;
        }

        System.out.print(n+"\n");
        f(n-1);
        System.out.print(n+"\n");

        return n;
    }
    public static void main(String[] args) throws IOException {
        f(3);
    }

}