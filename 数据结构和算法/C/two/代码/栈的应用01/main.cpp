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

//10进制转换任意进制,number表示要转换的十进制数，system表示进制选择
void systemConvert(int number,int system,SqStack *SS)
{
	int q;
	int r;
	r = number/system;//商
	q = number%system;//余数
	PushStack(SS,q);
	while(r!=0)
	{
		q = r%system;//计算余数
		r = r/system;//再计算新的商
		PushStack(SS,q);
	}
}
//初始化栈
void InitStack(SqStack *SS)
{
	SS->base = (SqNode *)malloc(sizeof(SqNode));	SS->top = SS->base;
}

//压栈
int PushStack(SqStack *SS,int e)
{
	SqNode *SN = (SqNode *)malloc(sizeof(SqNode));
	if(!SN)
	{
	printf("内存申请失败！\n");
		return 0;
	}
	SN->elem = e;
	SN->next = SS->top;
	SS->top = SN;
	return 1;
}

//弹栈
int PopStack(SqStack *SS)
{
	SqStack *S = SS; 
	if(S->top == S->base)
	{
		printf("栈为空！\n");
		return 0;
	}
	printf("%d\n",S->top->elem);
	SqNode * ss = S->top->next;
	free(S->top);
	S->top = ss;
	return 1;
}
