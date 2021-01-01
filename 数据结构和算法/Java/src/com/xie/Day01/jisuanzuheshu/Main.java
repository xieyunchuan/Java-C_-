package com.xie.Day01.jisuanzuheshu;
/*
2019 进行拆开 不能包括 2 和 4 共有多少种解法
1000+1001+18
 */
public class Main {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<2019;i++){
            for(int j=i+1;j<2019;j++){
                int z=2019-i-j;
                if(z!=i && z!=j){
                    //判断里面是否含有 2 4
                    String s_i=String.valueOf(i);
                    String s_j=String.valueOf(j);
                    String s_z=String.valueOf(z);
                 //   System.out.println(s_i);
                    if(z<=0){
                        continue;
                    }
                    if(s_i.contains("2") || s_i.contains("4") ||
                            s_j.contains("2") || s_j.contains("4")||
                            s_z.contains("2") || s_z.contains("4")){
                        continue;
                    }
                    else {
                        count++;
                        System.out.println(i+"   "+j+"      "+z);
                    }
                }
            }
        }
   //     System.out.println("123".contains("2"));
        System.out.println((count/3));

        System.out.println("-------------------");
        int n = 10;
        int num = 0;
        for (int i = 1; i < n; i++) {
            if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1)
                continue;
            for (int j = i + 1; j < n; j++) {
                if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1)
                    continue;
                int k = n - i - j;
                if (i == k || j == k || i == j)
                    continue;
                if (k > 0 && (k + "").indexOf("2") == -1 && (k + "").indexOf("4") == -1){
                    num++;
                    System.out.println(i+"   "+j+"      "+k);
                }

            }
        }
        System.out.println(num / 3);
        }

} 