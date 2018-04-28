package com.week4.day1;

public class Rectangle {
    private int x, y;
    private int width,height;
        
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
    	
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void printValues(){
    	System.out.println(" The x" +this.x +" the y value " +this.y +
    			" the width " +this.width +"the heigt "+this.height);
    	
    }
   
}
