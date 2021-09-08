package com.lohit;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter the numbers : ");
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();

        double sum = a+b;

        System.out.println("The sum is "+ sum);

    }
}
