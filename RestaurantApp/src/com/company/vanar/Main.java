package com.company.vanar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        showMenu();
        selectOption();
    }
    public static void showMenu(){
        System.out.println("#------------------------------#");
        System.out.println("1 - Burger  250");
        System.out.println("2 - Kebab   150");
        System.out.println("3 - Beer    60");
        System.out.println("4 - Coca    30");
        System.out.println("5 - Juice   25");
        System.out.println("0 - Cash ");
        System.out.println("#------------------------------#");
    }
    public static void selectOption(){
        System.out.println("Your choice: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        calculateCost(option);
    }
    public static void calculateCost(int option ){
        int count =0;
            if (option == 1) {
                count += 250;
            } else if (option == 2) {
                count += 150;
            } else if (option == 3) {
                count += 60;
            } else if (option == 4) {
                count += 30;
            } else if (option == 5) {
                count += 25;
            } else {
                System.out.println("Bye!!!");
            }
        int cost = count;
                showCost(cost);
    }
    public static void showCost(int cost){
        System.out.println(cost);
    }
}
