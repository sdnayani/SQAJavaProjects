package com.week3.day4.classes;

public class checkHackerRank {
	
	public static void main(String[] args){
		String s="hereiamstackerrank";
		String s1="hackerworld";
		System.out.println(" Does the String contain hackerrank" +checkIfIsHacker(s));
	}
	public  static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
}
