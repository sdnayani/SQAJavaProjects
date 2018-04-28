package com.week3.day4.classes;

public class camelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int terms=	getCamelCaseTerms("saveChangesInTheEditor");
	System.out.println(" The terms "+terms);
	

	}
	
	public static  int getCamelCaseTerms(String s){
		int terms = 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter == letter.toUpperCase()) {
                terms++;
                }
           }
        
        return terms;
        //System.out.println(terms);
      }
		
	}
