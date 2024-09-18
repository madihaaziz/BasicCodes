package com.assignment4_functions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" natural numbers: "+sum(n));
    }
    static int sum(int num){
        int sums=0;
        for(int i=1;i<=num;i++){
            sums+=i;
        }
        return sums;
    }
}
