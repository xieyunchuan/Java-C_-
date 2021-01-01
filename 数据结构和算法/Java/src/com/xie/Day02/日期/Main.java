package com.xie.Day02.日期;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year = 2020;
        int month = 1;//1是二月 0是1月
        int day = 1;
        calendar.set(Calendar.YEAR, year);// 将year的值赋给calender的YEAR字段
        calendar.set(Calendar.MONTH, month);//将month的值赋给calender的MONTH字段
        calendar.set(Calendar.DAY_OF_MONTH,day);//将day的值赋值给calendder的DAT_OF_MONTH字段
        System.out.println(calendar);
    }
} 