package com.lohit;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 1;

        while (c<=10) {
            System.out.println(c + " * "+  a+ " = " + (c*a)  );
            c++;
        }
    }
}
