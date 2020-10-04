#include<stdio.h>
#include<string.h>
main(){
	char c[]="BASIC\ndBASE";
    puts(c);//把字符串打印到屏幕上
	 char st[15];
	 printf("input string:\n");
	 gets(st);//和scanf的差异就是不以空格作为结束符
	 puts(st);
	 strcat(c,st);
	 puts(c);
	 strcpy(c,st);
	 puts(c);
}