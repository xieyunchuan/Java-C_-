package com.xie.Day01.特别的数;

import java.util.Scanner;

/*
小明对数位中含有2、0、1、9的数字很感兴趣（不包括前导0），在1到40中这样的数包括1、2、9、10至31,32、39和40，共28个，他们的和是574。


1:
 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        //暴力一点
        int i,sum=0;
        for(i=1;i<=n;i++){
            if(String.valueOf(i).contains("0")|| String.valueOf(i).contains("1") || String.valueOf(i).contains("2") || String.valueOf(i).contains("9")){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
} 