package com.xie.Day02.数组的常见操作;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = {1,2,3};
//        int[] b = new int[10];
//      //  b = a.clone();
//        for(int i = 0; i < 3; i++){
//            System.out.print(a[i]+" ");
//        }
//        System.out.print("\n");
//        for(int i = 0; i < 3; i++){
//         //   System.out.print(b[i]+" ");
//        }
//
//        System.arraycopy(a, 0, b, 2, 3);// 把源数组的开始位置开始拷贝到目标数组的开始位置开始长度为3的个数
//
//        for(int i = 0; i < 6; i++){
//            System.out.print(b[i]+" ");
//        }
        int[] a = {1, 2, 3, 4};
        int[] b ;
        b = Arrays.copyOf(a, 4);//从开始位置到目标位置为4的拷贝给数组b
        System.arraycopy(a, 0, b, 0, 3);
        for(int i = 0; i < 4; i++)
            System.out.println(b[i]);

    }
} 