package com.lohit;

import java.util.Scanner;

public class AvgOfNnumbers {
    public static void main(String[] args) {
        System.out.println("Avg of N numbers");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num;
        double sum =0;

        for (num = 0; num <= n ; num++) {
          sum += num;
        }
        double avg = sum / n;
        System.out.println("The Avg of "+ n + "is : " + avg);
    }
}
