#include<stdio.h>
extern int a=2;
main(){
	extern int a;//只要声明了 那么就会在源文件里面去找
   printf("%d",a);
}