package com.example;

public class Alien {
    // private Laptop lap;
    private Computer comp;
    private int age; 

    public Alien(int age, Computer comp) {
        System.out.println("Alien object created successfully");
        this.age = age;
        this.comp = comp;
    }
    

    public void code() {
        System.out.println("i am coding");
        comp.compile();
    }

    public Computer getComp () {
        return comp;
    }
    
    public void setComp(Computer comp) {
        this.comp = comp;
    }
    
    // Add getter/setter for age if needed
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}