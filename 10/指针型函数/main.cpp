#include<stdio.h>
main(){
	int i;
 char *day_name(int n); 
 printf("input Day No:\n");
 scanf("%d",&i);
 if(i<0) return;
 printf("Day No:%2d-->%s\n",i,day_name(i));
}
char *day_name(int n){
 static char *name[]={ "Illegal day",
 "Monday",
 "Tuesday",
 "Wednesday",
 "Thursday",
 "Friday",
 "Saturday",
 "Sunday"};
 return((n<1||n>7) ? name[0] : name[n]);
}