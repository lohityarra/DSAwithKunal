package com.lohit;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        System.out.println("Ënter the Number :");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n>0 && n%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
