package com.week3.day2.examples.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.week3.day2.examples.AddElementsToArrayListFromString;

public class Week3Day2Tests {
  @Test
  public void compareLists() {
	  
	  ArrayList<String>expectedArrayList= new ArrayList<String>();
	  expectedArrayList.add("Tom");
	  expectedArrayList.add("Harry");
	  expectedArrayList.add("Ajeet");
	  String[] elements={"Tom","Harry","Ajeet"};
	  ArrayList<String> actualList= AddElementsToArrayListFromString.addElements(elements);
      Assert.assertEquals(expectedArrayList, actualList);
       
  }
}
