#include<stdio.h>
int main(){
 int a=15432100;
 float b=123.1234567;
 double c=12345678.1234567;
 char d='p';
 printf("a=%d,%3d,%o,%x\n",a,a,a,a);//%3d ���û������λ�þ��ÿո���
 printf("b=%f,%lf,%5.4lf,%e\n",b,b,b,b);//%5.4lf ��������5λ С��4λ
 printf("c=%lf,%f,%8.4lf\n",c,c,c);
 printf("d=%c,%3c\n",d,d);
}