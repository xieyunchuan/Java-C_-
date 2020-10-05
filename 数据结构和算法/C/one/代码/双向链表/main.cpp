#include<stdio.h>
#include <windows.h>

struct Stu{
	char *s[15];
	int age;
};

struct LNode{
 Stu *stu;
//数据域
 LNode *next;
//指针域
 LNode *prior;
};
bool initList(LNode *head){
  head=(struct LNode*)calloc(1,sizeof(struct LNode));
  head->next=head;
  head->prior=head;
  head->stu=NULL;
  printf("----------------------***********--------------初始化ok!----------------*************---------------------------**********\n");
  return true;
}
/*
i表示需要进行开辟的空间
*/
bool createList(LNode *head,int i){
    LNode *L=head;// 移动指针 
	for(int j=0;j<i;j++){
      LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	  p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
      printf("----------------------***********--------------请输入学生的姓名和年龄----------------*************--------------**********\n");
	  scanf("%s %d",p->stu->s,&p->stu->age);
	  p->next=head;
	  p->prior=L;
	  head->prior=p;//开头的前指针指向最后 确定
	  L->next=p;
	  L=p;
	}
	return true;
}

/*
i:表示你要插入的位置
*/
bool insertList(LNode *head,int i){
	LNode *temp=head;
	head=head->next;
	int j=1;
	while(head!=temp && j<i){
		j++;
        head=head->next;
	}
	if(j!=i){
		return false;
	}
    LNode *prior=head->prior;
    LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
      printf("----------------------***********--------------请输入学生的姓名和年龄----------------*************--------------**********\n");
	  scanf("%s %d",p->stu->s,&p->stu->age);

	  prior->next=p;
	  p->prior=prior;
      
	  head->prior=p;
	  p->next=head;
      return true;
}

void show(LNode *head){
     LNode *temp=head;
     head=head->next;
	 while(head!=temp){
       printf("%s %d\n",head->stu->s,head->stu->age);
	   head=head->next;
	 }
}
main(){
	system("color 17");
	//初始化双向链表
    LNode head;
    initList(&head);
    createList(&head,3);
    printf("----------------------***********--------------学生的姓名和年龄----------------*************--------------**********\n");
	show(&head);
    insertList(&head,2);
    show(&head);
}