#include<stdio.h>

long Fact (long n){
if(n==0) return 1; //递归终止的条件
else return n*Fact(n-1);//递归步骤
}

long FactII (long n){
if(n==0) return 0; //递归终止的条件
if(n==1) return 1;
else return FactII(n-1)+FactII(n-2);//递归步骤
}

main(){
long p=FactII(3);
printf("%d",p);
}