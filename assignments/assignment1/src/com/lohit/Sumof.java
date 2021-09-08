package com.lohit;

import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
        System.out.println("Enter the numbers :");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true){
            int a = in.nextInt();
            sum = sum + a;
            if (in.hasNext("x") ){
                System.out.println("Program has ended");
                System.out.println("the sum is : " + sum);
            }
            else {
                continue;
            }
        }
    }
}
