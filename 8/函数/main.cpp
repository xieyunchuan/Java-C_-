#include<stdio.h>
main(){
	int i=8;
   printf("%d\n%d\n%d\n%d\n",++i,--i,i++,i--);//´ÓÓÒµ½×ó 8 7 8 8
   i=show();
   printf("%d",i);
}

int show(){
	return 0;
}