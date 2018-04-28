package com.week3.day2.examples;

import java.util.HashSet;

public class HashSetExamples {
	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      //hset.add(null);
	      //hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset.contains("Mango"));
	      
	      System.out.println(hset);
	      System.out.println(hset.remove("Fig"));
	      System.out.println(hset);
	      
	      System.out.println(hset.size());
	    }

}
