#include<stdio.h>
#include <windows.h>
#define MAXSIZE 3//顺序表可能达到的最大长度

typedef struct Stu{
	char *s[15];
	int age;
};




struct {
 Stu elem[MAXSIZE];
//存储空间的基地址
int length ;
//当前长度
}sqList;//匿名结构体 

main(){
	system("color 17");
	sqList.length=MAXSIZE;
	printf("%d",sqList.length);
	for(int i=0;i<MAXSIZE;i++){
	   sqList.elem[i].age=i;
	   printf("请输入学生的姓名为%d",sqList.elem[i].age);
	   scanf("%s",sqList.elem[i].s);
	}
    printf("-----------------------------------------------------------------------------------------------\n");
   for(i=0;i<MAXSIZE;i++){
	  printf("年龄:%d",sqList.elem[i].age);
	  printf("姓名:%s\n",sqList.elem[i].s); 
   }
}


//实现CRUD....