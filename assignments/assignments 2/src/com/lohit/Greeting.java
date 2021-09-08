package com.lohit;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Enter the name : ");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.println("Hi, " + name + "! you fucking twerp.");

    }
}
