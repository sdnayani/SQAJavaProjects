package com.week2.day4.examples.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.week2.day4.examples.computeSum;

public class testComputeSum {
  @Test
  public void testSumNumbers() {
	  int result=computeSum.sumNumbers(10, 20);
	  Assert.assertEquals(result, 30);
	  
  }
}
