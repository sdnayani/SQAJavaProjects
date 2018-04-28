package com.week3.day4.classes;

class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();  //bike1 is firstInstance.
        Bicycle bike4 = new Bicycle();   //bike2 is secondInstance
        //Bicycle bike2 = new Bicycle();   //bike2 is secondInstance
        //Invoiking Constructors.
       BicycleUsingConstructors myBike = new BicycleUsingConstructors(30, 0, 8);
       BicycleUsingConstructors myBike1 = new BicycleUsingConstructors();
       myBike.printStates();
       myBike1.printStates();
       
       // myBike1.printStates();
        // Invoke methods on 
        // those objects
       /* bike1.changeCadence(80);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.changeDirection(5);
        Bicycle.changeDirection(10);
        
        bike1.printStates();
        
        bike4.changeCadence(90);
        bike4.speedUp(20);
        bike4.changeGear(6);
        bike4.changeDirection(10);
       
        bike4.printStates();*/
        
      //  System.out.println(" Printing Mountain Bike Class");
        
         /*MountainBike mountainbike= new MountainBike();
    	     mountainbike.speedUp(20);
       	mountainbike.applyBrakes(10);
       	mountainbike.setHeight(20);
      	mountainbike.printStates();
      	MountainBike mountainbike1= new MountainBike(10,20,30,40);*/
        
//Instances are independent of each other...2 seperate instance.
        
       // myBike.printStates();
    }
}

