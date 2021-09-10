package com.lohit;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        //area of a circle
        double pi = 3.14;
        System.out.println("Enter the radius");
        Scanner in = new Scanner(System.in);

        double r = in.nextDouble();

        double ar = pi * (r*r) ;

        System.out.println(ar);


        //perimeter of a circle


    }
}
