package com.xie.Day05;

import java.util.concurrent.ConcurrentHashMap;

/**
 * jdk8 放弃了分段锁而是用了Node锁，减低锁的粒度，提高性能，并使用CAS操作来确保Node的一些操作的原子性，取代了锁。
 * 但是ConcurrentHashMap的一些操作使用了synchronized锁，而不是ReentrantLock,虽然说jdk8的synchronized的性能进行了优化，
 * 但是我觉得还是使用ReentrantLock锁能更多的提高性能
 */
public class ConCurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> concurrentHashMap=new ConcurrentHashMap<>();

        Thread thread=new Thread(new A(concurrentHashMap,"A"));

        Thread thread1=new Thread(new A(concurrentHashMap,"B"));

        thread.start();

        thread1.start();


    }
}


class A implements Runnable{

    public ConcurrentHashMap<String,Integer> concurrentHashMap;

    public String name;


    public A(ConcurrentHashMap<String,Integer> concurrentHashMap,String name){
        this.concurrentHashMap=concurrentHashMap;
        this.name=name;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            concurrentHashMap.put(name+i,i);
        }

        for(int i=0;i<10;i++){
            System.out.println(name+":"+concurrentHashMap.get(name+i));
        }
    }
}