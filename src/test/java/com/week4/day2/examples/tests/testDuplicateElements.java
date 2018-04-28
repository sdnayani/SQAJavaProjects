package com.week4.day2.examples.tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.week4.day2.examples.FindDuplicatesUsingNoCollections;


public class testDuplicateElements {
  @Test
  public void testDuplicates() {
	  int[] input  ={1,1,2,2,3,4};
	  int[] expectedDuplicates={1,2};
	  
	  ArrayList<Integer> ActualDuplicates=FindDuplicatesUsingNoCollections.removeDuplicateElementsUsingHashSet(input);
	  System.out.println(" The Actual " +Arrays.toString(ActualDuplicates.toArray()));
	  System.out.println(" The  expected " +Arrays.toString(expectedDuplicates));
	  //ActualDuplicates.toArray();
	  
	 Assert.assertTrue(Arrays.toString(ActualDuplicates.toArray()).equals(Arrays.toString(expectedDuplicates)));
	 //Assert.assertTe
	 //System.out.println(" The String " +ActualDuplicates);
	
	  
  }
}
