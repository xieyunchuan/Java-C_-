package com.xie.Day04.Test01;

import com.xie.Day03.初始化顺序.A;

import java.lang.reflect.Method;

public class ClassLoaderTest {
    public static void main(String[] args) throws Exception {
        A a= (A) Class.forName("com.xie.Day03.初始化顺序.A").newInstance();
        System.out.println(a.x);
        Class<A> aClass= (Class<A>) Class.forName("com.xie.Day03.初始化顺序.A");
        String  name= aClass.getName();
        System.out.println(name);
        Method method=aClass.getMethod("show");
        method.invoke(a);
        ClassLoader classLoader=ClassLoaderTest.class.getClassLoader();
        classLoader.loadClass("com.xie.Day03.初始化顺序.A");
    }
} 