package com.company;

public class Car extends Vehicle{

    private String engineType;

    public Car(String color, int wheels, int doors, String model, int lights, String engineType) {
        super(color, wheels, doors, model, lights);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public void handSteering() {
        super.handSteering();
    }

    @Override
    public void changingGears() {
        super.changingGears();
    }

    @Override
    public void moving(int speed) {
        transmissionType();
        super.moving(speed);
    }

    public void transmissionType(){
        System.out.println("you are transmissionType method and moving in a fast car");
    }
}