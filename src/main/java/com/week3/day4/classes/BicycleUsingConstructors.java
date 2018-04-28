package com.week3.day4.classes;

public class BicycleUsingConstructors {
	//Member variables...
    int cadence = 0;   ///state
    int speed = 0;     //state
    int gear = 1;     //state.
    
    //SameName as the method.
    
	public BicycleUsingConstructors(int startCadence, int startSpeed, int startGear) {
	    gear = startGear;
	    cadence = startCadence;
	    speed = startSpeed;
	}
	//Although Bicycle only has one constructor, 
	//it could have others, including a no-argument constructor:

		public BicycleUsingConstructors() {
		    gear = 1;
		    cadence = 10;
		    speed = 0;
		}
	
	void printStates() {
        System.out.println("cadence:" +
            cadence + " speed:" + 
            speed + " gear:" + gear);
   }

}
