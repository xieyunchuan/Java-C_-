package com.xie.Day04.Test3;

import java.util.Arrays;

public class Person
{
    String name;
    int age;
    public Person(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args)
    {
        Person[] people=new Person[]{new Person("xujian", 20),new Person("xiewei", 10)};
        System.out.println("排序前");
        for (Person person : people)
        {
            System.out.print(person.getName()+":"+person.getAge());
        }
        Arrays.sort(people,new PersonCompartor());
        //可以放置到数组里面进行排序   也可以使用集合类进行排序
        System.out.println("\n排序后");
        for (Person person : people)
        {
            System.out.print(person.getName()+":"+person.getAge());
        }
    }
}