package com.xie.Day01.pipeizichuang;

import java.util.HashSet;
import java.util.Set;

/**
 * 匹配子串问题
 */
public class Main {
//    public static void main(String[] args) {
//        String s="aaab";
//        int count=0;//用于记录最后的值
//        int len=s.length();
//        HashSet<String> hashSet=new HashSet<String>();
//        for(int i=len;i>0;i--){
//            int temp=len-i;
//           for(int j=0;j<=temp;j++){
//               String s1=s.substring(j,j+i);
//               hashSet.add(s1);
//           }
//           //每次都统计这次容器里面的数量
//        }
//        System.out.println(hashSet.size());
//    }
public static void main(String[] args) {
    String s="0100110001010001";
    Set<String> set=new HashSet(0);
    for(int i=0;i<s.length();i++){
        for(int j=i+1;j<=s.length();j++){
            String s1=s.substring(i,j);
            set.add(s1);
        }
    }
    System.out.println(set.size());
}
} 