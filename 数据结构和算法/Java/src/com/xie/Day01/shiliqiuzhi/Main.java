package com.xie.Day01.shiliqiuzhi;

/**
 * 1 1 1 3 5 9 17 从第四项开始 接下来的每一项就是前3项的和 求20190324项目的最后的四位
 */
public class Main {
//    public static void main(String[] args) {
//        /*int p=123456789;
//        根据求余数的方法计算得到那个值之后就可以求出最后的4位数了
//        System.out.println(p%10000);*/
//        //构建
//        int[] ints={1,1,1};
//        int temp=0;//记录每次得到的值
//        for(int i=4;i<=20190324;i++){
//            //外部循环计算得到这个具体的值
//            temp=(ints[0]+ints[1]+ints[2])%10000;
//            //内循环进行移动新的值
//            for(int j=0;j<2;j++){
//                //前移
//                ints[j]=ints[j+1];
//            }
//            ints[2]=temp;
//        }
//        System.out.println(ints[2]);
//    }


    public static void main(String[] args) {
        int a=1,b=1,c=1;
        for(int i=3;i<20190324;i++){
            int temp=(a+b+c)%10000;
            a=b;
            b=c;
            c=temp;
        }
        System.out.println(c);
    }
} 