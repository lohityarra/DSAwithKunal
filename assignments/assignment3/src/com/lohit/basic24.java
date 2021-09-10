package com.lohit;

import java.util.Scanner;

public class basic24 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner in = new Scanner(System.in);
        int sum=0;

        while (true){
            int num = in.nextInt();
            if (num !=0){
                sum += num ;
            }
            else{
                System.out.println(" The sum is " + sum);
            }

        }


    }
}
