package com.week2.day5.examples;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name={"Mr ","Smith"};
		String[][]names  ={
				//1st row
			 	{"Mr","Mrs","Ms"},
			 	//2nd row
				{"Smith","Jones"}
				
		      };
		//This will output Mr.Smith..
		System.out.println(names[0][0]+names[1][0]);
		//This will output ?
		
		System.out.println(names[0][2]+names[1][1]);
		
		}

	}

