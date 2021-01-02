package com.xie.Day04.Test3;

public class A implements Comparable {
    public int mark;


    @Override
    public int compareTo(Object o) {
        A a= (A) o;
        if(this.mark>a.mark){
            return 1;
        }
        else if(this.mark==a.mark){
            return 0;
        }
        else {
            return -1;
        }
    }
}