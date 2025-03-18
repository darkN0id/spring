package com.example;

public class Alien {
    // private Laptop lap;
    private Computer comp;
    private Computer comp1;
    private int age; 

    public Alien(int age, Computer comp, Computer comp1) {
        System.out.println("Alien object created successfully");
        this.age = age;
        this.comp = comp;
        this.comp1 = comp1;
    }
    
    public Alien() {
        System.out.println("Alien object created successfully");
    }
    
    public void code() {
        System.out.println("i am coding");
        comp.compile();
        comp1.compile();
    }

    public Computer getComp () {
        return comp;
    }
    
    public void setComp(Computer comp) {
        this.comp = comp;
    }
    public Computer getComp1 () {
        return comp1;
    }
    
    public void setComp1(Computer comp1) {
        this.comp1 = comp1;
    }
    
    // Add getter/setter for age if needed
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}