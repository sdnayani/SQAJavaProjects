package com.week3.day2.examples;

import java.util.*;

public class AddElementsToArrayListFromString {
	
   public static void main(String args[]) {
      /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	   String s="hello";
	  ArrayList<String> obj = new ArrayList<String>();
       String[] arr= {"Ajeet","Harry","Chaitanya","Steve","Anuj"};
      obj= addElements(arr);
	  System.out.println("Current array list is:"+obj);
   }

   public static ArrayList<String> addElements(String[] words){
	   
	   ArrayList<String> obj = new ArrayList<String>();
	   for(String str:words){
		   System.out.println(" The String value  " +str);
		   //String str="Ajeet"
		   //str"Ajeet"
		   //Harry
		   //Chaityna
		   obj.add(str);
	   }
	   
	   return obj;
	   
	   
   }
}
