package com.company.max;

import database.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        Location l = new Location("Md","Ch","bg/22");
        Offer of= new Offer('$',30000,"NO RULES");
        Garage g = new Garage(null,0,20f,l,of);
        g.toFile("GarageInfo","Garage.txt");
        Apartment a = new Apartment(6,12,200f,l,of);
        a.toFile("ApartmentInfo","Apartment.txt");
        Villa v = new Villa(4,2,488f,l,of);
        v.toFile("Villa","Villa.txt");
        System.out.println("Apartment " + a);
        System.out.println("Garage " + g);
        System.out.println("Villa " + v);
    }
}
