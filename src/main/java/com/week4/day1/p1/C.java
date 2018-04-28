package com.week4.day1.p1;
/*
 * 
 * protected: The protected access modifier is specified using the keyword protected.

 The methods or data members declared as protected are accessible within same package or sub classes in different package.

In this example, we will create two packages p1 and p2. Class A in p1 is made public, to access it in p2. 
The method display in class A is protected and class B is inherited from class A and this protected method is then accessed by creating an object of class B.
 */
public class C {
	 protected void display()
	    {
	        System.out.println("In class C");
	    }

}

//{2, 6, 3, 9, 11}
//printArrray(2,3,6,9,11 ,9)

//A[0]+A[arr.len-1];