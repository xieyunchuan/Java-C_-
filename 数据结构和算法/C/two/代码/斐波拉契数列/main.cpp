#include<stdio.h>

long Fact (long n){
if(n==0) return 1; //�ݹ���ֹ������
else return n*Fact(n-1);//�ݹ鲽��
}

long FactII (long n){
if(n==0) return 0; //�ݹ���ֹ������
if(n==1) return 1;
else return FactII(n-1)+FactII(n-2);//�ݹ鲽��
}

main(){
long p=FactII(3);
printf("%d",p);
}