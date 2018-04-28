package com.week4.day5.examples.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.week4.day4.examples.SuperReducedStringExercise;

//import junit.framework.Assert;

public class testSuperReducedString {
	
  @Test
  public void testSuperReducedString1() {
	  
	  String expectedReducedString="abd";
	  String str=SuperReducedStringExercise.superReducedString("aaabccddd");
	  System.out.println(" The Superreduced String "+str);
	  Assert.assertEquals(expectedReducedString, str);
	  
	  
  }
}
