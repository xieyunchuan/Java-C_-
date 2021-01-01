package com.xie.Day02.基础算法;

import java.io.*;

/**
 * A B C
 * D E F  = A * E F + B * D F + C * D E
 * G H I        H I       G I       G H
 * 函数的出口是2阶行列式
 */
public class digui {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int Int(String s){return Integer.parseInt(s);}

    public static void copy(int[][]A, int[][] A1, int i, int len) throws IOException {
        for(int x = 1; x < len; x++)
            for(int y = 0, j = 0; j < len; j++)
                if(j != i) {
                    A1[x-1][y++] = A[x][j];
                }
    }

    public static int F(int[][] A, int len)throws Exception{
        int res = 0; //保存每个矩阵的|A|
        if(len == 1)return A[0][0];
        if(len == 2){
            return A[0][0]*A[1][1] - A[0][1]*A[1][0]; // 递归出口
        }
        else{
            int A1[][] = new int[10][10];
            for(int i = 0; i < len; i++){
                copy(A, A1, i, len);
                res += Math.pow(-1, i) * A[0][i] * F(A1, len-1); //递归式
            }
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        int n;
        n = Integer.parseInt(in.readLine());

        int arr[][] = new int[10][10];

        for(int i = 0; i < n; i++){
            String[] s = in.readLine().split(" ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Int(s[j]);
            }
        }

        out.write(F(arr, n) + "\n");
        out.flush();
    }
} 