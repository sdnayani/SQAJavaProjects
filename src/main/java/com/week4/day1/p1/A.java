package com.week4.day1.p1;

/*
 * 
 * Private: The private access modifier is specified using the keyword private.

    The methods or data members declared as private are accessible only within the class in which they are declared.
    Any other class of same package will not be able to access these members.
    Classes or interface can not be declared as private.

In this example, we will create two classes A and B within same package p1. We will declare a method in class A as private and try to access this method from class B and see the result.
 */
class A
{
  private  void display()
    {
        System.out.println("GeeksforGeeks");
    }
  
}