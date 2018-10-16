package com.company.max.Hous;

public class Dog{
    static int days = 0;
    public String name;
    public double weight;
    public double age;

    public Dog(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void eat( int quantity ) {
        age++;
        ++days;
        weight += ((quantity * 1) / 100);

    }
    public String toString(){
        return this.name + "( Dog ) Weight: " + (this.weight) +  " Age: " + (int)(this.age /365) + " Days: " + days;
    }
}
