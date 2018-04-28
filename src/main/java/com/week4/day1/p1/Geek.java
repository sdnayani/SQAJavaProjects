package com.week4.day1.p1;

//Class Geeks is having Default access modifier
//Default access Modifier is a Package Private..other classes cannot access it
/*
 * Default: When no access modifier is specified for a class , method or data member – It is said to be having the default access modifier by default.

    The data members, class or methods which are not declared using any access modifiers i.e. having default access modifier are accessible only within the same package.

In this example, we will create two packages and the classes in the packages will be having the default access modifiers and we will try to access a class from one package from a class of second package.
 */

 class Geek
{
  void display()
     {
         System.out.println("Hello World!");
     }
}
