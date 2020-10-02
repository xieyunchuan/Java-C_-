#include<stdio.h>
int main(){
    int a=2,b=4,c=6,x,y;
    y=(x=a+b),(b+c);
	printf("%d",y);
	return 0;
}