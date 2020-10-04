#include<stdio.h>
main(){
	int a[5]={1,2,3,4,5};
	int *p=a,*q=a,i=0;
	/*for(int i=0;i<5;i++){
       printf("%d\n",*(p++));//*(p++) µÈ¼Û *q++ == a[0]
	}*/

	for(i=0;i<5;i++){
       printf("%d===>",(*q)++);
	   q++;
	}
	q=&a[0];
	printf("\n");
    for(i=0;i<5;i++){
       printf("%d===",a[i]);
	}
}