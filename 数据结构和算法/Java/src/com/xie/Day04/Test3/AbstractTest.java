package com.xie.Day04.Test3;

public  abstract  class AbstractTest {
    public static void main(String[] args) {
        System.out.println("抽象类可以有main方法");
        A a=new A();
        a.mark=123;
        System.out.println(a.mark);
    }
} 