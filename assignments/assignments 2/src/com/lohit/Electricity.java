package com.lohit;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        System.out.println("Enter the units consumed :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        float amount ;
        float surcharge;

        if (num > 500){
            amount = (float) (num * 9.65);
            surcharge = 85;
        }
        if (num >= 300){
            amount = (float) (num * 7.75);
            surcharge = 75;
        }
        if (num >= 200){
            amount = (float) (num * 5.26);
            surcharge = 55;
        }
        if (num >= 100){
            amount = (float) (num * 3.76);
            surcharge = 35;
        }
        else {
            amount = (float) (num *2.25);
            surcharge = 25;
        }

        float total = amount + surcharge;
        System.out.println("The bill amount is :" + total);
    }
}