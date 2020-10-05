#include<stdio.h>
#include <windows.h>
#define MAXSIZE 3//顺序表可能达到的最大长度

struct Stu{
	char *s[15];
	int age;
};

struct LNode{
 Stu *stu;
//数据域
 LNode *next;
//指针域
}LinkList;

bool Init(LNode *L){
	L->stu=NULL;;
	L->next=NULL;
	if(L->stu==NULL){
		return false;
	}
	return true;
}
bool ListInsert(LNode *L);

bool ListShow(LNode *L);

bool ListInsertByI(LNode *L,int I);

bool ListDeleteByI(LNode *L,int I);
main(){
 system("color 17");
 Init(&LinkList);
 for(int i=0;i<2;i++){
   ListInsert(&LinkList);
 }
  printf("开始\n");
  ListShow(&LinkList);
  ListInsertByI(&LinkList,2);
  printf("插入第二位置\n");
  ListShow(&LinkList);
  printf("删除第二位置\n");
  ListDeleteByI(&LinkList,2);
  ListShow(&LinkList);

 /* Stu *k=new Stu[2];
  k->age=12;
  printf("%d",k->age);*/ C++的写法 new一个对象
}


bool ListInsert(LNode *L){
	while(L->next!=NULL){
        L=L->next;
	}
	 LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	 printf("录入学生姓名 和 年龄\n");
     p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
     scanf("%s %d",p->stu->s,&p->stu->age);
	 L->next=p;
	 p->next=NULL;
	 return true;
}


bool ListShow(LNode *L){
		L=L->next;
	while(L!=NULL){
     
		printf("学生姓名%s 年龄%d\n",L->stu->s,L->stu->age);
		L=L->next;
	}
	return true;
}

bool ListInsertByI(LNode *L,int I){
	 LNode *head;
	//先找到对应的位置 再执行插入
	for(int i=0;i<I;i++){
		head=L;
		L=L->next;
		if(L==NULL){
			return false;
		}
	}
	//执行插入
    LNode *least;
    least=L;
    LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	 printf("录入学生姓名 和 年龄\n");
     p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
     scanf("%s %d",p->stu->s,&p->stu->age);
	head->next=p;
	p->next=least;
	return true;
}

bool ListDeleteByI(LNode *L,int I){
   LNode *head;
	//先找到对应的位置 再执行插入
	for(int i=0;i<I;i++){
		head=L;
		L=L->next;
		if(L==NULL){
			return false;
		}
	}
	//执行删除
     LNode *least=L->next;
     head->next=least;
	 free(L);
	 return 1;
}
