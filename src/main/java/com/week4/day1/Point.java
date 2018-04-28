package com.week4.day1;

public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void printValues(){
    	System.out.println(" The x" +this.x +" the y value " +this.y);
    	
    }
}