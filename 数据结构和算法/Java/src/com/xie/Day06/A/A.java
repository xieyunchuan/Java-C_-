package com.xie.Day06.A;

public class A implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            System.out.println("A:"+i);
            if(i==500){
               Thread.yield();//虽然A让出了时间片 但是join方法 让B线程再次运行的条件是A线程执行完成！ 所以这里A让出时间片 只能给其它线程去使用
                System.out.println("手动让出时间片");
            }
        }
    }
}