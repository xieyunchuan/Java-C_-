package com.xie.Day02.优先队列;

import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(new InputStreamReader(System.in));
        PriorityQueue<Integer> Q = new PriorityQueue();
        int a;
        for(int i = 0; i < 10; i++){
            a = in.nextInt();
            Q.add(a);
            System.out.print(Q.peek()+" ");// 输出当前队列的最小元素
        }
    }


}