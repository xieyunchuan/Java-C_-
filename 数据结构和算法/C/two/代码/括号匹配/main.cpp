#include <stdio.h>
#include <stdlib.h>
#define size 50

typedef struct{
	char elem[size];
	int top;
}seqstack ;

void initStack(seqstack *s)
{
	s->top=-1;
}

int Push(seqstack *s,char str)
{	int i=0;
	if(s->top==size-1) return 1;
	else if (str!='\0')
    {
    		s->top++;
	    s->elem[s->top]=str;
	   
	}
	
	return 0;
}

int pop(seqstack *s ,char *str)
{
	if(s->top==-1) return 1;
	else {
	
	 *str=s->elem[s->top];
	  printf("%c",*str);
	 s->top--;
	 
	}
	return 0;
}

int gettop(seqstack *s,char *ch)
{	

	if(s->top==-1) return 1;
	else{
	
		*ch=s->elem[s->top];
		
		return 1;	    
	}	
}

bool  Match(char ch,char str)
{
	if((ch=='<'&&str=='>')||(ch=='{'&&str=='}')||(ch=='('&&str==')'))
	return 1;
	else
	return 0;
}

bool isEmpty(seqstack *s)

{
	if(s->top==-1) return 1;
	else return 0;
}

void brackMatch(char *str)
{
	seqstack s,*p;
	int i;
	char ch,sh;
	initStack(&s);
	for(i=0;str[i]!='\0';i++)
	{
		switch(str[i])
		{
			case'(':
			case'[':
			case'{':
				Push(&s,str[i]);
			break;
			case')':
			case']':
			case'}':
			if(isEmpty(&s))
			{
				printf("\n”“¿®∫≈∂‡”‡");
			}
			else{
				gettop(&s,&ch);
				if(Match(ch,str[i]))
				{
					pop(&s,&sh);
				}
				else
				{
					printf("\n∂‘”¶µƒ¿®∫≈≤ª∆•≈‰"); 
					return;
				}
			}
				
		}
					
	}
		if(isEmpty(&s))
		{
			printf("\n¿®∫≈∆•≈‰");
		}
		else
		printf("\n◊Û¿®∫≈∂‡”‡");
}

int main(){
	char str[100], enter,ch;
	seqstack s;
	initStack(&s);
	printf("«Î ‰»Î◊÷∑˚¥Æ:\n");
	scanf("%s",str);
	scanf("%c",&enter);
	brackMatch(str); 	
	printf("\n");
		
}
