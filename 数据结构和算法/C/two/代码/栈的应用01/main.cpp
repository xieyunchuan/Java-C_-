#include<stdio.h>
#include<malloc.h>

typedef struct SqNode{
	int elem;
	struct SqNode *next;
}SqNode;

typedef struct SqStack{
	SqNode *base;
	SqNode *top;
}SqStack;

void systemConvert(int number,int system,SqStack *SS);

void InitStack(SqStack *SS);

int PushStack(SqStack *SS,int e);

int PopStack(SqStack *SS);


int main()
{
	SqStack SS;
	InitStack(&SS);
	int number,system;
	scanf("%d",&number);
	scanf("%d",&system);
	systemConvert(number,system,&SS);
	while(SS.top!=SS.base)
	{
		PopStack(&SS);
	}
	return 0;
}

//10����ת���������,number��ʾҪת����ʮ��������system��ʾ����ѡ��
void systemConvert(int number,int system,SqStack *SS)
{
	int q;
	int r;
	r = number/system;//��
	q = number%system;//����
	PushStack(SS,q);
	while(r!=0)
	{
		q = r%system;//��������
		r = r/system;//�ټ����µ���
		PushStack(SS,q);
	}
}
//��ʼ��ջ
void InitStack(SqStack *SS)
{
	SS->base = (SqNode *)malloc(sizeof(SqNode));	SS->top = SS->base;
}

//ѹջ
int PushStack(SqStack *SS,int e)
{
	SqNode *SN = (SqNode *)malloc(sizeof(SqNode));
	if(!SN)
	{
	printf("�ڴ�����ʧ�ܣ�\n");
		return 0;
	}
	SN->elem = e;
	SN->next = SS->top;
	SS->top = SN;
	return 1;
}

//��ջ
int PopStack(SqStack *SS)
{
	SqStack *S = SS; 
	if(S->top == S->base)
	{
		printf("ջΪ�գ�\n");
		return 0;
	}
	printf("%d\n",S->top->elem);
	SqNode * ss = S->top->next;
	free(S->top);
	S->top = ss;
	return 1;
}
