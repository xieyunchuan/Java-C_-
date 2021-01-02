package com.xie.Day05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *在用迭代器遍历一个集合对象时，如果遍历过程中对集合对象的内容进行了修改（增 加、删除、修改），则会抛出 Concurrent Modification Exception
 *
 * Exception in thread "Thread-0" ADD
 * java.util.ConcurrentModificationException
 * 	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
 * 	at java.util.ArrayList$Itr.next(ArrayList.java:851)
 * 	at com.xie.Day05.B.run(fail_fast.java:47)
 * 	at java.lang.Thread.run(Thread.java:748)
 *
 */
public class fail_fast {
    public static void main(String[] args) throws InterruptedException {
        List<String> list=new ArrayList<>();
        for(int i=0;i<1000;i++){
            list.add(i+":");
        }

        Thread thread=new Thread(new B(list));
        thread.start();

        for(int i=100;i<10000;i++){
            list.add(i+":");
            Thread.sleep(10);
            System.out.println("ADD");
        }


    }
}

class B implements Runnable {
    public   List<String> list;

    public B(List<String> list){
        this.list=list;
    }

    @Override
    public void run() {

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B:"+iterator.next());
        }
    }
}

