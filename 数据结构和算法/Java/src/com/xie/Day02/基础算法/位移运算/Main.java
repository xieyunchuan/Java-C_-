package com.xie.Day02.基础算法.位移运算;

public class Main {
    public static void main(String[] args) {
        int n=4;
        System.out.println((n>>2)&1);//获取第3位的值
        System.out.println(n&1);//使用&运算就可以获取到这个值
        System.out.println(3&1);//一个数的二进制数的最低位如果是1 则该数一定是奇数 否则一定是偶数

    }
} 