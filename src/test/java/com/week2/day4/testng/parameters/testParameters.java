package com.week2.day4.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testParameters {
	@Parameters({ "first-name" })
	@Test
	public void testSingleString(String firstName) {
	  System.out.println("Invoked testString " + firstName);
	  assert "Cedric".equals(firstName);
	}
}
