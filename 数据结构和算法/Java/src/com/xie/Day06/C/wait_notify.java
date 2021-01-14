package com.xie.Day06.C;

public class wait_notify {
/*
使用wait 和 notify本质就是使用的锁对象
注意在使用volatile 保证数据共享的时候  注意使用方式  加了这个关键字的变量 表示这个对象的这个数据是线程之间共享  如果只是普通的一个放在寄存器的变量加这个关键值没有任何效果
 */

    public static void main(String[] args) {

      Object o=new Object();
      Good good=new Good();
      Consumer consumer=new Consumer(o,good);
      Produce produce=new Produce(o,good);
      Thread thread=new Thread(consumer);
      Thread thread1=new Thread(produce);
      thread.start();
      thread1.start();

    }
}

class Consumer implements Runnable{
    Good good;

    public Object object;

   public Consumer (Object o, Good good){
       this.good=good;
       this.object=o;
   }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
        synchronized (object){
            System.out.println("Consumer"+good.count);
                if(good.count>1){
                    eatCount();
                    System.out.println("消费完");
                    try {
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            System.out.println("Consumer再次等待object资源");
        }
    }

    public void eatCount() {
       while (good.count>0){
           good.count--;
       }
    }
}

class Produce implements Runnable{
    Good good;

    public Object object;

    public Produce(Object o,Good good){
        this.good=good;
        this.object=o;
    }
    @Override
    public void run() {
            for(int i=0;i<5;i++){
                synchronized (object){
                    System.out.println("Produce"+good.count);
                if(good.count<2){
                    makeCount();
                    System.out.println("生产ok"+good.count);
                    try {
                        object.notify();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    try {
                        object.notifyAll();
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
                System.out.println("Produce再次等待object资源");
        }
    }

    public void  makeCount(){
        while (good.count<1000)
        {
          good.count++;
         }
    }
}

class Good{
    public volatile int count;//生产的数目

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}