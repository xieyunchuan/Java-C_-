#include<stdio.h>
#include<string.h>
main(){
	char c[]="BASIC\ndBASE";
    puts(c);//���ַ�����ӡ����Ļ��
	 char st[15];
	 printf("input string:\n");
	 gets(st);//��scanf�Ĳ�����ǲ��Կո���Ϊ������
	 puts(st);
	 strcat(c,st);
	 puts(c);
	 strcpy(c,st);
	 puts(c);
}