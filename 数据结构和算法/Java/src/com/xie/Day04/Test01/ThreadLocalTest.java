package com.xie.Day04.Test01;

public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<String>();
        ThreadA threadA=new ThreadA(threadLocal,"A");
        ThreadA threadB=new ThreadA(threadLocal,"PersonCompartor");
        threadA.run();
        threadB.run();
    }
}
class ThreadA extends Thread{
    private ThreadLocal<String> threadLocal=new ThreadLocal<String>();
    private String name;
    public ThreadA(ThreadLocal threadLocal,String name){
        this.threadLocal=threadLocal;
        this.name=name;
    }
    @Override
    public void run() {
        threadLocal.set("线程"+name);
        System.out.println(threadLocal.get());
    }
}