package net.smerdel;

public class Vehicle {


    private String carClass;
    private String model;
    private String year;
    private String fuelType;
    private String engineType;
    private int passengerCapacity;
    private int basePrice;
    private int currentSpeed;

    public Vehicle(String carClass, String model, String year, String fuelType, String engineType, int passengerCapacity, int basePrice, int currentSpeed) {
        this.carClass = carClass;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.engineType = engineType;
        this.passengerCapacity = passengerCapacity;
        this.basePrice = basePrice;
        this.currentSpeed = currentSpeed;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void upShifting(){
        System.out.println();
        currentSpeed += 5;
        System.out.println("upshifted");
    }

    public void downShifting(){
        System.out.println("called Vehicle.downShifting");
        currentSpeed -= 5;
    }

}
