#include<stdio.h>
#include <windows.h>
#define MAXSIZE 3//˳�����ܴﵽ����󳤶�

struct Stu{
	char *s[15];
	int age;
};

struct LNode{
 Stu *stu;
//������
 LNode *next;
//ָ����
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
  printf("��ʼ\n");
  ListShow(&LinkList);
  ListInsertByI(&LinkList,2);
  printf("����ڶ�λ��\n");
  ListShow(&LinkList);
  printf("ɾ���ڶ�λ��\n");
  ListDeleteByI(&LinkList,2);
  ListShow(&LinkList);

 /* Stu *k=new Stu[2];
  k->age=12;
  printf("%d",k->age);*/ C++��д�� newһ������
}


bool ListInsert(LNode *L){
	while(L->next!=NULL){
        L=L->next;
	}
	 LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	 printf("¼��ѧ������ �� ����\n");
     p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
     scanf("%s %d",p->stu->s,&p->stu->age);
	 L->next=p;
	 p->next=NULL;
	 return true;
}


bool ListShow(LNode *L){
		L=L->next;
	while(L!=NULL){
     
		printf("ѧ������%s ����%d\n",L->stu->s,L->stu->age);
		L=L->next;
	}
	return true;
}

bool ListInsertByI(LNode *L,int I){
	 LNode *head;
	//���ҵ���Ӧ��λ�� ��ִ�в���
	for(int i=0;i<I;i++){
		head=L;
		L=L->next;
		if(L==NULL){
			return false;
		}
	}
	//ִ�в���
    LNode *least;
    least=L;
    LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	 printf("¼��ѧ������ �� ����\n");
     p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
     scanf("%s %d",p->stu->s,&p->stu->age);
	head->next=p;
	p->next=least;
	return true;
}

bool ListDeleteByI(LNode *L,int I){
   LNode *head;
	//���ҵ���Ӧ��λ�� ��ִ�в���
	for(int i=0;i<I;i++){
		head=L;
		L=L->next;
		if(L==NULL){
			return false;
		}
	}
	//ִ��ɾ��
     LNode *least=L->next;
     head->next=least;
	 free(L);
	 return 1;
}
