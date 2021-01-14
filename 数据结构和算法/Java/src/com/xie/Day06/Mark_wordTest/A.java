package com.xie.Day06.Mark_wordTest;
/**
我们理解一个对象头主要由上图两个部分组成（数组对象除外，数组对象的对象还包含一个数组长度），由我们的推导出Mark word是8个字节，klass word(开启指针压缩的情况下是4个字节，
不开启的时候是8个字节)。我们打印出来的对象头是12个字节，所以其中的8个字节是Mark word，剩下的4个字节是klass word，但是和锁相关的就是Mark word
 **/
public class A {
    private boolean flag;

   // public int i;  这个对象的大小还是没有改变一共16B，其中对象头(object header) 12B,boolean字段flag（对象的实例数据）占1B，
    // 剩下的3B就是对齐字节。由此我们可以认为一个对象的布局大体分为三个部分分别是对象头(Object header)、对象的实例数据、字节对齐。


} 