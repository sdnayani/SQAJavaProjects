package com.week4.day1;

public class ACMEBicycle  implements BicycleInterface {
	int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

   public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
    public static void main(String[] args){
    	ACMEBicycle acmeBicycle= new ACMEBicycle();
    	acmeBicycle.changeCadence(20);
    	acmeBicycle.printStates();
    	
    }

}
