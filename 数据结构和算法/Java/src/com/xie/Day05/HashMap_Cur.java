package com.xie.Day05;

import java.util.Collections;
import java.util.HashMap;

public class HashMap_Cur {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap=new HashMap<>();
        Collections.synchronizedMap(hashMap);//实现线程安全的hashMap集合
    }
} 