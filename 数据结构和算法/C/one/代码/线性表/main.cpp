#include<stdio.h>
#include <windows.h>
#define MAXSIZE 3//˳�����ܴﵽ����󳤶�

typedef struct Stu{
	char *s[15];
	int age;
};




struct {
 Stu elem[MAXSIZE];
//�洢�ռ�Ļ���ַ
int length ;
//��ǰ����
}sqList;//�����ṹ�� 

main(){
	system("color 17");
	sqList.length=MAXSIZE;
	printf("%d",sqList.length);
	for(int i=0;i<MAXSIZE;i++){
	   sqList.elem[i].age=i;
	   printf("������ѧ��������Ϊ%d",sqList.elem[i].age);
	   scanf("%s",sqList.elem[i].s);
	}
    printf("-----------------------------------------------------------------------------------------------\n");
   for(i=0;i<MAXSIZE;i++){
	  printf("����:%d",sqList.elem[i].age);
	  printf("����:%s\n",sqList.elem[i].s); 
   }
}


//ʵ��CRUD....