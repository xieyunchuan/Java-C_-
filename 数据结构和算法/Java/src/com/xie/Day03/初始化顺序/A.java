package com.xie.Day03.初始化顺序;

public class A {
    public static A a=new A();
    public static int count;
    public int x;
    public A() {
        System.out.println("初始化A类");
        x=count;
        count++;
    }
    {
        System.out.println("A同步代码块");
    }
    static {
        count=10;
        System.out.println("A静态代码块");
    }

    public void show(){
        System.out.println("xxxA");
    }

} 