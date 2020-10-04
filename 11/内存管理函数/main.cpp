#include<stdio.h>
#include<stdlib.h>

struct stu
{
 int num;
 char *name;
 char sex;
 float score;
}


main(){
char *pc,*p;
pc=(char *)malloc(100);
p=pc;
for(int i=0;i<100;i++){
	*pc=i;
	pc++;
}

for(i=0;i<100;i++){
  // printf("%d",*p++);
}


 stu *s=(struct stu*)calloc(2,sizeof(struct stu));
 stu *s2=(struct stu*)malloc(2);

 s2->name="xxx";
 s2->score=2.0;

 s2++;
 printf("%d\n",s2);
 s2->name="xxxk";
 s2->score=3.0;
 //  free(s2);
 printf("%d\n",s2);

  printf("%s+%d",s2->name,s2->score);

  free(s);

}