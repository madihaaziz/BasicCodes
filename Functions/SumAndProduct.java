package com.assignment4_functions;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Sum: "+add(a,b));
        System.out.println("Product: "+product(a,b));


    }
    static int add(int x,int y){
        return x+y;
    }
    static int product(int x,int y){
        return x*y;
    }
}
