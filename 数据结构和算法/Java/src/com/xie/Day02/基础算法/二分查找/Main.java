package com.xie.Day02.基础算法.二分查找;

/**
 * 一般的整数哈希函数：hash(x) = (x%P+P)%P
 * P一般取大于最大数据量的第一个质数。
 */
public class Main {
    public static void main(String[] args) {
        int i=(8%11+11)%11;
        System.out.println(i);
    }
} 