package com.xie.Day03.初始化顺序;

public class B extends A {
    public B (){
        System.out.println("初始化B");
    }
    static {
        System.out.println("静态初始化B");
    }
    {
        System.out.println("B同步代码块");
    }

    public static void main(String[] args) {
        B b=new B();
        System.out.println(B.a.x);
    }
} 