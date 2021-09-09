package com.lohit;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        // fibonnaci series for N numbers
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        System.out.print(p+" , "+ i);

        int count = 2;

        while (count<=n ){
            int temp = i;
            i = i+p;
            p = temp;

            count++;
            System.out.print(" , " + i);
        }


    }
}
