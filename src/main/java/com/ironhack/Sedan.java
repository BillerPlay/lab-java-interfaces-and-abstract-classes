package com.ironhack;

public class Sedan extends Car{
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }

    @Override
    public String getInfo(){
        return "Car's details: " + getVinNumber() + " | "+ getMake() + " | " + getModel() + " | " + getMileage();
    }
}
