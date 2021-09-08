package com.lohit;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");

//        for a year to be a leap year it has to be divisible by 400 and 4
//        and not by 100
        int a = in.nextInt();

        if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0 ){
            System.out.println("Leap Year");
        }

        else if (a % 100 == 0){
            System.out.println(" Not a Leap Year");
        }


    }
}
