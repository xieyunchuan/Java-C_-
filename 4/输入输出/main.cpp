#include<stdio.h>
main(){

int s,a;
scanf("%d %d",&a,&s);//��Scanf����������ʲô��ʽ  ���������ʱ��ʹ��ʲô��ʽ
printf("%d %d",s,a);
scanf("%d %*d %d",&a,&s);//
printf("%d %d",s,a);
scanf("%4d%4d",&a,&s);// 12345678
printf("%d %d",s,a);// ����5678 1234

}