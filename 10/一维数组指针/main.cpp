#include<stdio.h>
void show(int (*p)[3]);

main(){
	int a[2][3];
	int count=0;
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			a[i][j]=count++;
	}
	}
	for(i=0;i<2;i++){
		for(int j=0;j<3;j++){
			printf("%d ",&a[i][j]);
	}
		printf("\n");
	}
	show(a);
}
void show(int (*p)[3]){
	int i=0;

	for(i;i<4;i++){
		printf("%d\n",*(p+i));
	}
	//2种写法 的不同结果
	for(i=0;i<4;i++){
		printf("%d\n",(*p+i));
	}
}