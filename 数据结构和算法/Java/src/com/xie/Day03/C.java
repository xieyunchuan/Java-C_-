package com.xie.Day03;

public class C {
 //   C c=new C();//循环初始化 栈溢出

    public static int count=0;
 {
     System.out.println("同步代码块会"+count);//依附在构造方法上 优先于构造方法执行！
     count++;
 }

 public void  show(){
     System.out.println("xxx");
 }

    public static void main(String[] args) {
        C c=new C();
        C c1=new C();
        C c2=new C();
        c.show();
    }
} 