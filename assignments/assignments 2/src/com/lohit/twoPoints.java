package com.lohit;

import java.util.Scanner;

public class twoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates x1,y1,z1 and x2,y2,z2,: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)+Math.pow((z1-z2),2));
        System.out.println("The distance between points ("+x1+","+y1+","+z1+") and ("+x2+","+y2+","+z2+") = "+distance);
    }
}
