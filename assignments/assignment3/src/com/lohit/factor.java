package com.lohit;

import java.util.Scanner;

public class factor {
    public factor() {

    }
    public static void main(String[] args) {
        System.out.println("enter : ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.println("The factors of "+ a + "are:");

        for (int i = 1; i <= a; i++) {

            if (a%i==0){
                System.out.print(" "+i);
            }

        }


    }
}
