#include<stdio.h>
main(){
	char s[]={"ccxxccc"};
	char c[]={'c',' ','p','r','o','g','r','a','m','\0'};//和上面的差异 就是我们需要手动结尾\0!
	printf("%s",s);
	printf("%s",c);
	char st[1];
	 printf("input string:\n");
	 scanf("%s",st);
	 printf("%s\n",st);
}