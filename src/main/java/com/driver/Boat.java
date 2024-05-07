package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int  capacity;
    // Constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementing the method from WaterVehicle interface
    @Override
    public String getVehicleName() {
        return name;
    }

    // Implementing the method from WaterVehicle interface
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

}