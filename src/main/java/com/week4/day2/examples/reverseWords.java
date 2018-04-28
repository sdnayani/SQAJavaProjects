package com.week4.day2.examples;

public class reverseWords {
	
public static String reverserWordsInSentence(String sentence){
	//StringBuilder sb= new StringBuilder();
	String s="";
	if((sentence!=null)&&(!sentence.isEmpty())){
		//Hello World
		//Hello -0
		//World-1
		String[] words= sentence.split("//s+");	
		//System.out.println(" the String " +words[0]);
	     for(int i=0; i<words.length; i++){
	    	// System.out.println(" the String " +words[i]);
	    	 //int len=words.length;
	    	 //words[len-1-i])
	    	 //sb.append(words[words.length-1-i]).append(" ");
	    	 s=s+words[words.length-1-i]+" ";
	    	 /*for (int i = str.length - 1; i >= 0; i--) {
	    		   finalStr += str[i] + " ";
	    		  }*/
	    	 
	     }
	     
	}
	return s.trim();	
}

}
