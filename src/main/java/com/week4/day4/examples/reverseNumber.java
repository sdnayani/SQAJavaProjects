package com.week4.day4.examples;

public class reverseNumber {
	
	public static void main(String args[]) {
		int reverse=reverse(1234);
		System.out.println(" The reverse " +reverse);
		
		
		
	}
	
	public static int reverse(int number){
		
		int reverse=0;
	
			while(number>0){
				System.out.println(" The number " +number);
				reverse=(reverse*10)+(number%10);
				number=number/10;
				
			}
			return reverse;
	}

}
