package com.lohit;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        System.out.println("enter the price:");

        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();

        System.out.println("enter the dicount rate: ");
        double rate = in.nextDouble();
        double discount = price - ((price*rate)/100);

        System.out.println(discount);

    }
}
