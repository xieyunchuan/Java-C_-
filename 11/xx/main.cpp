#include<stdio.h>
main(){

	int a[][3]={{1,2,3},{4,5,6}};
	for(int i=0;i<3;i++){
		for(int p=0;p<3;p++){
			printf("%d   ",&a[i][p]);
		}
		printf("\n");
	}
	printf("%d  ",&a[1]);
	printf("%d  ",&a[1][0]);

	printf("%d",*(a+1));
}