package com.week4.day3.examples;

public class StringBuilderDemo {
	public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
         
        StringBuilder sb = new StringBuilder(palindrome);
        StringBuilder sb1 = new StringBuilder();
        sb.reverse();  // reverse it
        sb.deleteCharAt(2);
        sb.append(" Hello");
       sb.toString();
       sb1.append("Hello1");
        System.out.println(sb1);
        
    }
}
