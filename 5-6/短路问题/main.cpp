#include<stdio.h>
main(){
	/*  int x,y,z;
	  x=0;
	  y=0;
	  if(x++>0 || y++>0){
		  printf("看结果1");
		  printf("%d,%d",x,y);
	  }
	   printf("%d,%d\n",x,y);//1 1

	  x=0;
	  y=0;
	 if(++x>0 || y++>0){//后面的这个由于之前的已经瞒足ture了所有后面的这个就不会再++ 这就是短路效应!
		  printf("看结果2");
		  printf("%d,%d",x,y);// 1 0
	  }*/
	 char c='k';
	 int i=1,j=2,k=3;
	 float x=3e+5,y=0.85;
	 printf("%d,%f\n",!x*!y,!x);// !x=0
	 printf("%d,%d\n",x||i&&j-3,i<j&&x<y);
	 printf("%d,%d\n",i==5&&c&&(j=8),x+y||i+j+k);
      
}
