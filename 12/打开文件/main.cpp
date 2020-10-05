#include<stdio.h>
main(){
  FILE *file;
  file=fopen("E:\\java_C数据结构\\Java-C_-\\12\\123.txt","ab");
  if(file==NULL)
  {
 printf("\nerror on open c:\\hzk16 file!");
  }
  fputs("你好",file);
   fclose(file);
   file=fopen("E:\\java_C数据结构\\Java-C_-\\12\\123.txt","rt");
     char str[11];
	 fgets(str,11,file);
    printf("\n%s\n",str);
    printf("\n%c\n",str[0]);
	fclose(file);

 /*int a[3][4]={0,1,2,3,4,5,6,7,8,9,10,11};
 int (*p)[4];
 int i,j;
 p=a;
 for(i=0;i<3;i++)
{for(j=0;j<4;j++) printf("%2d ",&*(*(p+i)+j));
printf("\n");}
 {for(j=0;j<4;j++) printf("%d ",&a[j][0]);
printf("\n");}
 {for(j=0;j<4;j++) printf("%d ",p++);
printf("\n");}*/


}
