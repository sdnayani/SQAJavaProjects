package com.week3.day3.examples;

public class reverseString {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        String reverse=reverseString1(palindrome);  
        System.out.println(reverse);
    }

  public static String reverseString1(String str){
	  int len = str.length();
      char[] tempCharArray = new char[len];
     // char[]  temp= new char[7];
      char[] charArray = new char[len];
      
      // put original string in an 
      // array of chars
      for (int i = 0; i <= len; i++) {
          tempCharArray[i] = 
        		  str.charAt(i);
      } 
      
              
      // reverse array of chars
      for (int j = 0; j < len; j++) {
          charArray[j] =
              tempCharArray[len - 1 - j];
      }
      
      String reversePalindrome =
          new String(charArray);
      if(reversePalindrome.equals(str)){
    	  System.out.println(" The Strings are equal");
      }
      else {
    	  System.out.println(" The Strings are not equal");
      }
      
      return reversePalindrome;
      }
  
}