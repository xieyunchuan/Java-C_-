#include<stdio.h>
void main(){
    char* s;
	s="xx";
	printf("%s",s);
    int i=0;
	int count=0;
	 while(true){
		 if(s[i]!='\0'){
		count++;
		i++;}
		else{
	     break;
		}
	}
    printf("%d",count);//����õ�����ַ����ĳ���
}