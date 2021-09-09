package com.lohit;

import java.util.Scanner;

public class Larger {
    public static void main(String[] args) {
        System.out.println("Enter the first Number :");
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();

        System.out.println("Enter the Second Number :");
        double b = in.nextDouble();

        if (a>b){
            System.out.println(a+ " is Greater");

        }
        else if (b>a){
            System.out.println(b + " is Greater");
        }

        else{
            System.out.println(a +" and "+ b + " are equal.");
        }
    }
}
