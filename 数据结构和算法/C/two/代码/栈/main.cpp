#include<stdio.h>
#include<stdlib.h>
#define MAXSIZE 100//顺序栈存储空间的初始分配量

struct STU{
	char *name;
	int age;
};

struct SpStack{
	STU *base;
STU * top; 
int stacksize;
};

bool InitStack(SpStack *s){
	/*if((s->base)!=NULL) {
		printf("为什么一来就不是%d\n",s->base);
	}*/
    s->base=new STU[MAXSIZE];
	s->top=s->base;
	s->stacksize=MAXSIZE;
	return true;
}



bool Push(SpStack *s, STU stu) {
	if (s->top-s->base==s->stacksize) return false; //栈满
	*(s->top++)=stu;
	return true;
}

STU* Pop (SpStack *s) {
if (s->top==s->base) return 0;//做点提示
 return --s->top;
}


main(){
SpStack s;
InitStack(&s);
STU stu=*(new STU());
stu.name="xxxx";
stu.age=18;
Push(&s, stu);
STU *stu2=Pop (&s);
printf("%s %d",stu2->name,stu2->age);
}

