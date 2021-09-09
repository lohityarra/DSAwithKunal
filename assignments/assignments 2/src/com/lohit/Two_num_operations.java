package com.lohit;

import java.util.Scanner;

public class Two_num_operations {
    public static void main(String[] args) {
        System.out.println("Enter the first Number :");
        Scanner in = new Scanner(System.in);
        double ans;
        double a = in.nextDouble();
        System.out.println("Enter the Second Number :");
        double b = in.nextDouble();

        System.out.println("Enter the Operation :");

        char d = in.next().charAt(0);

        if (d== '+') {
            ans = a + b;
            System.out.println(ans);
        }

        else if (d =='-'){
            ans = a - b;
            System.out.println(ans);
        }

        else if (d=='*'){
            ans = a * b;
            System.out.println(ans);
        }

        else if (d=='/'){
            ans = a / b;
            System.out.println(ans);
        }

        else {
            System.out.println("Enter proper operator");
        }
    }
}
