package com.week3.day4.classes;

public class Student {
	int id;
	String name;
	int age;
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int Age){
		this.age=Age;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getAge(){
		return this.age;
	}
	
	public void printInfo(){
		System.out.println("Name:" +
	             name + " Id:" + 
	             id + " Age:" + age);
	    }
	
}


