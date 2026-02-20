package com.ironhack;

public class Truck extends Car{
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    String getInfo() {
        return "Car's details: " + getVinNumber() + " | "+ getMake() + " | " + getModel() + " | " + getMileage() + " | Towing Capacity: " + getTowingCapacity();
    }
}
