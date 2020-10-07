#include<stdio.h>
int Match(char s[10],char s2[10]);
int GetLength(char s[10]);
main(){
	char s[10];
	char s2[10];
	scanf("%s  %s",s,s2);
    printf("%d",Match(s,s2));
}

int Match(char s[10],char s2[10]){
	int len=GetLength(s);
    int len2=GetLength(s2);

	for(int i=0;i<len;i++){
        int temp=i;

		for(int j=0;j<len2;j++){
			//½øÐÐ±©Á¦Æ¥Åä
            if(s[i]==s2[j]){
             i++;
			}
			else{
             break;
			}
		}
        i=temp;
		if(j==len2){
			return i+1;
		}

	}
return 0;
}

int GetLength(char s[10]){
	int i=0;
	while(s[i]!='\0')
	{
		i++;
	}
	return i;
}