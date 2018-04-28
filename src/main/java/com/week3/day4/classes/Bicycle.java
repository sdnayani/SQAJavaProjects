package com.week3.day4.classes;
//A class is the blueprint from which individual objects are created..
//This class is Just the blue print of bycycles that are used in application.

class Bicycle {
//Member variables...
    int cadence = 0;   ///state
    int speed = 0;     //state
    int gear = 1;     //state.
  static int direction=10;
  static int direction1=10;

    //Member Methods..
    //The fields cadence, speed, and gear represent the object's state. They are Member variables. 
    //Methods (changeCadence, changeGear, speedUp etc.) define its interaction with the outside world.
    
  public Bicycle(){
	   
  }
    public Bicycle(int startCadence, int startSpeed, int startGear) {
    	
	// TODO Auto-generated constructor stub
    	this.cadence=startCadence;
    	this.speed=startSpeed;
    	this.gear=startGear;
}

	//behaviour..
    void changeCadence(int newValue) {
    	//int x=10;
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }
   public  static void changeDirection(int increment) {
    	direction = direction + increment;   
   }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear +"direction "+direction);
    }
}
