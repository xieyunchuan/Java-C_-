#include<stdio.h>
main(){
	int i=8;
   printf("%d\n%d\n%d\n%d\n",++i,--i,i++,i--);//���ҵ��� 8 7 8 8
   i=show();
   printf("%d",i);
}

int show(){
	return 0;
}