#include<stdio.h>
int main(){
 int a=15432100;
 float b=123.1234567;
 double c=12345678.1234567;
 char d='p';
 printf("a=%d,%3d,%o,%x\n",a,a,a,a);//%3d 如果没有填满位置就用空格填
 printf("b=%f,%lf,%5.4lf,%e\n",b,b,b,b);//%5.4lf 整数部分5位 小数4位
 printf("c=%lf,%f,%8.4lf\n",c,c,c);
 printf("d=%c,%3c\n",d,d);
}