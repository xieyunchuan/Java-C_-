package com.xie.Day05;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Enumeration（枚举）接口的作用和Iterator类似，只提供了遍历Vector和HashTable类型集合元素的功能，不支持元素的移除操作。
 * Enumeration 速度是 Iterator 的 2 倍，同时占用更少的内存。但是， Iterator 远远比 Enumeration 安全，
 * 因为其他线程不能够修改正在被 iterator 遍历的集合里面的对象。同时，Iterator 允许调用者删除底层集 合里面的元素，这对 Enumeration 来说是不可能的。
 */
public class Enumeration_Test {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Lisa");
        v.addElement("Billy");
        v.addElement("Mr Brown");
        Enumeration e = v.elements();//返回Enumeration对象
        while(e.hasMoreElements()){
            String value = (String)e.nextElement();//调用nextElement方法获得元素
            System.out.print(value);
        }
    }
} 