#include<stdio.h>
main()
{float a,b;
a=123456.7931E5;//对于这个float类型的数据只能保留7位有效数值这7位数值包括 了整数部分
b=a+20;
printf("%f\n",a);
printf("%f\n",b);
double x;
x=123456.7931233163E2;//对于double类型可以保留小数点后面的6位 6位之后进行四舍五入
printf("%f\n",x);
return 0;
}