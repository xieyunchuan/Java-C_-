#include<stdio.h>

int max(int a,int b){
 if(a>b)return a;
 else return b;
}

main(){
 int max(int a,int b);
 int(*pmax)(int a,int b);//�����Ӧ�ú�max�����Ĳ���һ��
 int x,y,z;
 pmax=max;
 printf("input two numbers:\n");
 scanf("%d%d",&x,&y);
 z=(*pmax)(x,y);
 printf("maxmum=%d",z);
}