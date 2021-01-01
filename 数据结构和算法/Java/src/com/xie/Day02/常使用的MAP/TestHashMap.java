package com.xie.Day02.常使用的MAP;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<String, String>();
        hashMap.put("x","xx");
        hashMap.put("xx","xxx");
        TreeMap<String,String> treeMap=new TreeMap<String, String>();
        treeMap.put("x","xxx");
        treeMap.put("xx","xxxxx");
        Set hashSet= hashMap.keySet();
        Iterator<String> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(treeMap.get(iterator.next()));
        }
        for (String s:treeMap.values()
             ) {
            System.out.println(s);
        }
        System.out.println(treeMap);
    }
} 