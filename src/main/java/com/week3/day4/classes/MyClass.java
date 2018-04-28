package com.week3.day4.classes;

public class MyClass {
	public static void main(String[] args){
		Student mark= new Student();  //mark-- is object or instances.
		mark.setAge(20);
		mark.setId(10);
		mark.setName("mark");
		System.out.println("The age set " +mark.getAge());
		mark.printInfo();
		
		
	}

}
