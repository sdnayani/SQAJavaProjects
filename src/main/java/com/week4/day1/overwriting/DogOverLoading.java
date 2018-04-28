package com.week4.day1.overwriting;

class DogOverLoading{
	
    public void bark(){
        System.out.println("woof ");
    }
 
    //overloading method
    public void bark(int num){
    	for(int i=0; i<num; i++)
    		System.out.println("woof ");
    }
}