package com.lohit;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the n value");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        System.out.print(p+" , "+ i);
        int count = 2;


        while (count <= n){
            int c = i;
            i = p+i;
            p = c;
            count++;
            System.out.print(" , " + i);


        }
    }
}
