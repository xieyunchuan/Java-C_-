#include<stdio.h>
#include <windows.h>

struct Stu{
	char *s[15];
	int age;
};

struct LNode{
 Stu *stu;
//������
 LNode *next;
//ָ����
 LNode *prior;
};
bool initList(LNode *head){
  head=(struct LNode*)calloc(1,sizeof(struct LNode));
  head->next=head;
  head->prior=head;
  head->stu=NULL;
  printf("----------------------***********--------------��ʼ��ok!----------------*************---------------------------**********\n");
  return true;
}
/*
i��ʾ��Ҫ���п��ٵĿռ�
*/
bool createList(LNode *head,int i){
    LNode *L=head;// �ƶ�ָ�� 
	for(int j=0;j<i;j++){
      LNode *p=(struct LNode*)calloc(1,sizeof(struct LNode));
	  p->stu=(struct Stu*)calloc(1,sizeof(struct Stu));
      printf("----------------------***********--------------������ѧ��������������----------------*************--------------**********\n");
	  scanf("%s %d",p->stu->s,&p->stu->age);
	  p->next=head;
	  p->prior=L;
	  head->prior=p;//��ͷ��ǰָ��ָ����� ȷ��
	  L->next=p;
	  L=p;
	}
	return true;
}

/*
i:��ʾ��Ҫ�����λ��
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
      printf("----------------------***********--------------������ѧ��������������----------------*************--------------**********\n");
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
	//��ʼ��˫������
    LNode head;
    initList(&head);
    createList(&head,3);
    printf("----------------------***********--------------ѧ��������������----------------*************--------------**********\n");
	show(&head);
    insertList(&head,2);
    show(&head);
}