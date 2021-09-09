package com.lohit;

import java.util.Scanner;

public class INR_to_USD {

    public static void main(String[] args) {
        System.out.println("Boom:");
        Scanner in = new Scanner(System.in);
        double amt = in.nextDouble();

        double In_Usd = amt * 0.014;
        System.out.println(In_Usd + " in USD");


    }
}
