package com.xie.Day02.大数类;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger a;
        BigDecimal b;
       //注意 val 不能超过 long 类型的最大取值9223372036854775807, 超过int时要在数后面加L如:
        a = BigInteger.valueOf(9223372036854775807L); //大于int范围的要加L
        a=a.add(a);
        a=a.add(a);
        b = BigDecimal.valueOf(123456.12341235); // 超出的小数位数会自动舍弃
        // 表示比int 长的数值
        System.out.println(a);
        a=BigInteger.valueOf(3);
        a=a.gcd(BigInteger.valueOf(6));
        System.out.println(a);
    }
} 