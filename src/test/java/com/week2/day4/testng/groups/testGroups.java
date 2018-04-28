package com.week2.day4.testng.groups;

import org.testng.annotations.Test;

public class testGroups {
	  @Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
	  }
	}
