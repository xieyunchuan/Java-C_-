#include<stdio.h>

int max(int a,int b){
 if(a>b)return a;
 else return b;
}

main(){
 int max(int a,int b);
 int(*pmax)(int a,int b);//这后面应该和max函数的参数一样
 int x,y,z;
 pmax=max;
 printf("input two numbers:\n");
 scanf("%d%d",&x,&y);
 z=(*pmax)(x,y);
 printf("maxmum=%d",z);
}