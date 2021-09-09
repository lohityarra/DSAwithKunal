package com.lohit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();


        //        switch (fruit){
        //
        //            case "Mango":
        //                System.out.println("King of Fruits");
        //                break;
        //
        //            case "Apple":
        //                System.out.println("A red fruit");
        //
        //            case "Orange":
        //                System.out.println("round fruit");
        //
        //            case "Grapes":
        //                System.out.println("Small fruit");
        //
        //            default :
        //                System.out.println("please enter a valid fruit");
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red Fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Enter a valid fruit");



        }

    }
}
