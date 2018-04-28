package com.week3.day4.classes;

public class MountainBike extends Bicycle {
    
    // the MountainBike subclass adds one field
    int seatHeight;

    public MountainBike(){
    	
    }
    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

    public void printStates() {
    	   super.printStates();
    	   System.out.println("seatHeight:" +seatHeight);
    }
    
/*public static void main(String[] args){
	
	MountainBike mountainbike= new MountainBike();
	mountainbike.speedUp(20);
	mountainbike.applyBrakes(10);
	mountainbike.setHeight(20);
	mountainbike.printStates();
		
     }*/
}
