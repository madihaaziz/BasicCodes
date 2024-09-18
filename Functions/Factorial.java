package com.assignment4_functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n){
        if(n==1 || n==0)
            return 1;
        else return n*fact(n-1);
    }
}
