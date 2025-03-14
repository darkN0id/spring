package com.example;

public class Alien {
    private Laptop lap;
    private int age; 

    public Alien(int age, Laptop lap) {
        System.out.println("Alien object created successfully");
        this.age = age;
        this.lap = lap;
    }

    public void code() {
        System.out.println("i am coding");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }
    
    public void setLap(Laptop lap) {
        this.lap = lap;
    }
    
    // Add getter/setter for age if needed
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}