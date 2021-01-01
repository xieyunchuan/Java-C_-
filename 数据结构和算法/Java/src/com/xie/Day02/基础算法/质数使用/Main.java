package com.xie.Day02.基础算法.质数使用;

public class Main {
    public static void prime(int n){
        for(int i = 2; i <= n / i; i++){
            int a = 0, b = 0;
            while(n % i == 0){
                a = i;
                n /= i;
                b++;
            }
            if(b > 0)
                System.out.println(a + " " + b);
        }
        if(n > 1) System.out.println(n + " " + 1);
    }

    public static void main(String[] args) {
        prime(30);
    }

} 