package com.assignment4_functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(pythoTriplet(a,b,c));
    }
    static boolean pythoTriplet(int a,int b,int c){
        return (a * a) + (b * b) == c * c || (b * b) + (c * c) == a * a || (c * c) + (a * a) == b * b;
    }
}
