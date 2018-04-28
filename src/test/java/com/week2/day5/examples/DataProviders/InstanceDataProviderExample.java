package com.week2.day5.examples.DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class InstanceDataProviderExample {

	    @Test(dataProvider="getData")

	    public void instanceDbProvider(int p1, String p2,String p3) {

	        System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
	    }  
	     
	    @DataProvider

	    public Object[][] getData() {

	        return new Object[][]{{5, "five","two"}, {6, "six","six1"},{7,"seven","seven1"}};

	    }

	}