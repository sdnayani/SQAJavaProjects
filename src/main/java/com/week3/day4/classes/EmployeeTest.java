package com.week3.day4.classes;

public class EmployeeTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne = new Employee("James Smith");
      Employee empTwo = new Employee("Mary Anne");

      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(40.55);
      empOne.printEmployee();
      
System.out.println("Second Print for emp2");
      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      
      System.out.println("After channge Emp1");
      empOne.printEmployee();
     // System.out.println("After channge Emp2");
     // empTwo.printEmployee();
   }
}
