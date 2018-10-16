package com.company.max.Hous;

public class Owner {

    public String fullname;
    public int age;
    public int food;

    public Owner(String fullname, int age, int food) {
        this.fullname = fullname;
        this.age = age;
        this.food = food;
    }

    public int getFood( int quantity ){
        age++;
        food -= quantity;
        return quantity;
    }

    public String toString() {
        return this.fullname + "( owner ) AGE: " + this.age/365 +" Food: " + this.food;
    }
}


