#include<stdio.h>
main(){
	int a[3];
//	printf("%d",a[0]);//�õ�һϵ�е����룡
	int x[][3]={1,2,3,4,5,6,7,8,9,10};//[4][3]  ֻ�ܲ�ָ���� ���Ǳ���ָ����
	for(int i=0;i<4;i++){
		for(int z=0;z<3;z++){
      	printf("%d",x[i][z]);
	}
			printf("\n");
	}
}