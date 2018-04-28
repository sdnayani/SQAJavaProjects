package com.week4.day4.examples;

public class SuperReducedStringExercise {

	public static String superReducedString(String str){
		StringBuffer s = new StringBuffer(str);
		for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
            	s.delete(i-1, i+1);
                i = 0;// go back to the beginning of the string again after deleting a pair of letters
            }
        }
        if (str.length() == 0) {
        	
            System.out.println("Empty String");
        } else {
        	
            System.out.println (str);
        }
        
        return str;
        }
	
}

