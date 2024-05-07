package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 6, isManual, "Formula 1", 1);
    }

    public void accelerate(int rate){
        int currentSpeed = getCurrentSpeed();
        int newSpeed = currentSpeed + rate; // Calculate the new speed by adding the rate

        if (newSpeed <= 0) {
            stop(); // Stop the car if the new speed is less than or equal to 0
        } else {
            // Determine the gear based on the new speed
            if (newSpeed <= 50) {
                changeGear(1);
            } else if (newSpeed <= 100) {
                changeGear(2);
            } else if (newSpeed <= 150) {
                changeGear(3);
            } else if (newSpeed <= 200) {
                changeGear(4);
            } else if (newSpeed <= 250) {
                changeGear(5);
            } else {
                changeGear(6);
            }

            // Change the speed and direction
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
