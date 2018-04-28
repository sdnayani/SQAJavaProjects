package com.week4.day4.examples;

public class SimpleSumArray {
	public static int simpleArraySum(int n, int[] ar){
		int sum=0;
		int i=0;
		while(i<n){
			 sum += ar[i];
				        i += 1;
				        
		}
		
		return sum;
		
	}

}
