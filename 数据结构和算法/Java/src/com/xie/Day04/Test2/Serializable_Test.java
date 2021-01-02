package com.xie.Day04.Test2;

import java.io.*;

public class Serializable_Test {
    public static void main(String[] args) {
        Out();
        Input();
    }

    public static void Out(){
        try {
            OutputStream outputStream=new FileOutputStream("E:\\java_C数据结构\\Java-C_-\\数据结构和算法\\Java\\src\\com\\xie\\Day04\\Test2\\1");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
            A a=new A();
            a.setMark(123);
            a.name="专业课";
            a.b=new B();
            a.b.name_B="B专业";
            objectOutputStream.writeObject(a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void Input(){
        try {
            InputStream inputStream=new FileInputStream("E:\\java_C数据结构\\Java-C_-\\数据结构和算法\\Java\\src\\com\\xie\\Day04\\Test2\\1");
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            A a= (A) objectInputStream.readObject();
            System.out.println(a.name+":"+a.mark+":"+a.b.name_B);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


