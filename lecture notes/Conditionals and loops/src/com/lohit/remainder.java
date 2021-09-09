package com.lohit;

public class remainder {
    public static void main(String[] args) {
        int n = 4537552;

        int ans = 0;

        while (n > 0){
            int r = n%10;
            n = n/10;

            ans = ans*10 +r;

        }

        System.out.println(ans);


    }
}
