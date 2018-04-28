package com.week3.day3.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound_Demo {

   public static void main(String args[]) {		
      File file = new File("E://file.txt");
      try {
    	  BufferedReader br = new BufferedReader(new FileReader(file));
	} 
      catch (ArrayIndexOutOfBoundsException e) {
    	 
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
   }
}