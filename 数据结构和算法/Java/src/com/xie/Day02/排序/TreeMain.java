package com.xie.Day02.排序;

import java.io.*;
import java.util.*;

public class TreeMain{
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        TreeSet<Integer> s = new TreeSet(new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });
      //  TreeSet<Integer> s = new TreeSet();
        s.add(10);
        s.add(5);
        s.add(4);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(9);
       //TreeSet集合默认就是按照从小到大来排序
        for(Integer p : s){
            out.write(p+" ");
        }
        out.flush();
    }
}

