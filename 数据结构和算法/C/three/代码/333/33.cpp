#include<stdio.h>
main(){
	int x=1,y=1,z=1,w=0;
	if(0 || ++y && ++z){//�� -- 
		printf("%d,%d,%d",x,y,z);
	}
}