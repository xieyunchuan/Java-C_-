#include<stdio.h>
main()
{
/* struct stu
 {
 int num;
 char *name;
 char sex;
 float score;
 } boy1,boy2;
 boy1.num=102;
 boy1.name="Zhang ping";
 printf("input sex and score\n");
 scanf("%c %f",&boy1.sex,&boy1.score);
 boy2=boy1;//ע��C����Ľṹ�����֮��ĸ�ֵ���ǰ�boy2ָ��boy1���ǰ�boy1����ṹ�����������ֵ��ֵ��boy2
 printf("Number=%d\nName=%s\n",boy2.num,boy2.name);
 printf("Sex=%c\nScore=%f\n",boy2.sex,boy2.score);
 boy2.name="xxx";
 printf("Number=%d\nName=%s\n",boy1.num,boy1.name);
 printf("Number=%d\nName=%s\n",boy2.num,boy2.name);*/
	int a[]={1,2,3};
	int p[]={4,5,6};
	p=a;//�ǲ����������ı����õĶ����
	printf("%d",p[0]);
}