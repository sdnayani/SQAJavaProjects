package com.week4.day1.overwriting;

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
//Hound h= new Hound();