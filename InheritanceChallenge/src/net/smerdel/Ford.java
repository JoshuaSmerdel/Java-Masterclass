package net.smerdel;

public class Ford extends Vehicle{

    private String make = "Ford";

    public String getMake() {
        return make;
    }

    public Ford(String carClass, String model, String year, String fuelType, String engineType, int passengerCapacity, int basePrice, int currentSpeed) {
        super(carClass, model, year, fuelType, engineType, passengerCapacity, basePrice, currentSpeed);
    }
}

