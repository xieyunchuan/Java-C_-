package com.xie.Day06.A;

public class B implements Runnable {
    Thread a;

    public B(Thread a){
       this.a=a;
    }
    @Override
    public void run() {
        for(int i=0;i<2000;i++){
            System.out.println("B:"+i);
            if(i==100){
                System.out.println("A"+"你先让我执行 a.join");//这个时候B线程就会进入阻塞 等待A线程执行完成
                try {
                    a.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}