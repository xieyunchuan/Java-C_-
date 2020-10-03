#include<stdio.h>
main(){

int s,a;
scanf("%d %d",&a,&s);//在Scanf函数里面是什么格式  就在输入的时候使用什么格式
printf("%d %d",s,a);
scanf("%d %*d %d",&a,&s);//
printf("%d %d",s,a);
scanf("%4d%4d",&a,&s);// 12345678
printf("%d %d",s,a);// 进行5678 1234

}