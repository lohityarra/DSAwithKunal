package com.lohit;


import java.util.Scanner;

public class PandS {
    public PandS() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int a = sc.nextInt();

        int sum = 0;
        int product = 1;

        int result;
        while(a>0) {
            sum += a % 10;
            product *= a % 10;
            a /= 10;
        }

        result = product - sum;
        System.out.println(result);
    }
}
