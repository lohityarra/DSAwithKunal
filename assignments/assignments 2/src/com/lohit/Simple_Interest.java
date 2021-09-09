package com.lohit;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        System.out.print("Enter the Principal: ");
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();

        System.out.print("Enter the Rate: ");
        float R = in.nextFloat();

        System.out.print("Enter the time: ");
        float T = in.nextFloat();

        double SI = (P*R*T)/100;

        System.out.println("The Simple Interest is: " + SI);
    }
}
