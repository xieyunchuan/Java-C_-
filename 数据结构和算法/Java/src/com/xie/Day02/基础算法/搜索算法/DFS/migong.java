package com.xie.Day02.基础算法.搜索算法.DFS;

public class migong {
    public static void main(String[] args) {
        int[][] map=new int[8][7];
        //1表示墙
        for (int i=0;i<7;i++){
            map[0][i]=1;
            map[7][i]=1;
        }
        for (int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][2]=1;
        map[3][1]=1;
        map[1][2]=1;
        map[5][3]=1;
        map[5][5]=1;
        map[5][6]=1;map[4][2]=1;map[7][2]=1;map[4][2]=1;



//        map[6][5]=2;
        //0为路 1为墙 2为终点 3不通

      for (int i=0;i<8;i++){
          for (int j=0;j<7;j++){
              System.out.print(map[i][j]+"  ");
          }
          System.out.println();
      }

      boolean f=getWay(map,1,1);
      System.out.println(f);
        for (int i=0;i<8;i++){
            for (int j=0;j<7;j++){
                System.out.print(map[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static boolean getWay(int[][] map,int i,int j){
        if(map[1][4]==2){//这里设置出口
         return true;
        }
        else {
            //按照下右上左走
            if(map[i][j]==0){
                map[i][j]=2;
                if(getWay(map,i+1,j)){
                    return true;
                }
                else if(getWay(map,i,j+1)){
                    return true;
                }
                else if(getWay(map,i-1,j)){
                    return true;
                }
                else if (getWay(map,i,j-1)){
                    return true;
                }
                else {
                    map[i][j]=3;
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }
} 