package com.lohit;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        float tempC = in.nextFloat();
        float tempf= (tempC *9/5) +32;
        System.out.println(tempf);

    }
}
