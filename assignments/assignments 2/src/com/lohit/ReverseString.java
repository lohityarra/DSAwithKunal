package com.lohit;

import java.util.Scanner;

public class ReverseString {
    private static String reverse;

    static String reverse(String abc ){
        
        for (int i = abc.length() - 1; i <= 0; i--) {


            reverse = reverse + abc.charAt(i);
        }
        return reverse;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the String");
        String hoop = in.nextLine();
        reverse(hoop);
    }
    
    
}
