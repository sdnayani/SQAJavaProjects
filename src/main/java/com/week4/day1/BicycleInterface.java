package com.week4.day1;

public interface BicycleInterface {
//  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
    //void brakes();

}
