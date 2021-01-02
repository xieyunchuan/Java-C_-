package com.xie.Day04.Test3;

import java.util.*;

public class Mian {
    public static void main(String[] args) {

    }


    public static void comparable(){
        List<A> list=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<3;i++){
            A a=new A();
            a.mark=random.nextInt();
            list.add(a);
        }

        Collections.sort(list);

        for (A a:list
        ) {
            System.out.println(a.mark);
        }
    }

    public static void Comparator(){

    }
} 