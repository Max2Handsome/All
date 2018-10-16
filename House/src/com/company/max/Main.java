package com.company.max;

import com.company.max.Hous.Dog;
import com.company.max.Hous.Owner;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Poll", 1000 * 1, 365 * 1.6);
        Owner owner = new Owner("Valera", 365 * 20, 1000 * 80);

        while (owner.food != 0) {
            dog.eat(owner.getFood(200));
            System.out.println(owner);
            System.out.println(dog);

        }


    }
}
