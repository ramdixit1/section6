package com.company;

public class Vehicle {

    private String color;
    private int Wheels;
    private int doors;
    private String model;
    private int lights;

    public Vehicle(String color, int wheels, int doors, String model, int lights) {
        this.color = color;
        Wheels = wheels;
        this.doors = doors;
        this.model = model;
        this.lights = lights;
    }

    public String getColor() {
        return color;
    }

    public int getWheels() {
        return Wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public int getLights() {
        return lights;
    }

    public void handSteering() {
        System.out.println("You are in hand steering method");
    }

    public void changingGears() {
        System.out.println("you are in changingGears Method");
    }

    public void moving(int speed) {
        System.out.println("you are in moving Method Speed is: " +speed);
    }

}
