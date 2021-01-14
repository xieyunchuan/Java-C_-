package com.xie.Day06.A;

public class yield_join {
    public static void main(String[] args) {
        A a=new A();
        Thread thread=new Thread(a);
        B b=new B(thread);
        Thread thread1=new Thread(b);
        thread.start();
        thread1.start();
    }
} 