package com.xie.Day06.C;

/**
 * 错误写法  ：
 * 1、本身这个对象里面的值本就不是线程安全的
 * 2.值传递 和 引用传递分差异
 *
 */
public class D {

    public static void main(String[] args) {
        E e=new E();
        F f=new F(e.countII);
        f.setCount(e.getCount());
        System.out.println(e.count==f.count);
        Thread thread=new Thread(e);
        Thread thread1=new Thread(f);
        thread.start();
        thread1.start();
    }
}

class E implements Runnable{
    public  volatile Integer count;//这个对象的值本就不是线程安全的。
    public  volatile int countII;//
    public E(){
        count=Integer.valueOf(0);
    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(count);
            System.out.println(countII);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class F implements Runnable{

    public  volatile Integer count;
    public  volatile int countII;


    public F(int countII){
        this.countII=countII;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public void run() {
     count=100;
     countII=1000;
        System.out.println("ok");
    }
}