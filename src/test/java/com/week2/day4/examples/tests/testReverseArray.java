package com.week2.day4.examples.tests;

import java.util.Arrays;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.week2.day4.examples.reverseArray;

import junit.framework.Assert;

public class testReverseArray {
  @Test
  public void testReverseArrayMethod() {
	  int[] numbers = { 1,2,3,4,5,6,7,8,9,10};
	  int[] expectedOutput={11,9,8,7,6,5,4,3,2,1};
	  int[] reverse=reverseArray.reverse(numbers);
	 Reporter.log("The input Array "+Arrays.toString(numbers));
	 Reporter.log("The expected Array "+Arrays.toString(expectedOutput));
	  
	  
	  Assert.assertTrue(Arrays.equals(reverse, expectedOutput));
	  
  }
}
