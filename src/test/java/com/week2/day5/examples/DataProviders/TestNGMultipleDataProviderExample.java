package com.week2.day5.examples.DataProviders;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.week2.day5.examples.Calculator;
//import com.week2.day5.examples.DataProviders.CalculatorDataProvider;

public class TestNGMultipleDataProviderExample {
	
	@Test(dataProvider = "addMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void testAddMethod(int a, int b, int expectedResult) {
		int sum=Calculator.add(a, b);
 
        Assert.assertEquals(sum, expectedResult);
    }
	
/*
    @Test(dataProvider = "subtractMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void testSubtractMethod(int a, int b, int expectedResult) {
  
        Assert.assertEquals(Calculator.subtract(a, b), expectedResult);
    }
 
    @Test(dataProvider = "multiplyMethodDataProvider", dataProviderClass = CalculatorDataProvider.class)
    public void testMultiplyMethod(int a, int b, int expectedResult) {
       // Calculator calculator = new Calculator();
        Assert.assertEquals(Calculator.multiply(a, b), expectedResult);
    }
 
*/
}
