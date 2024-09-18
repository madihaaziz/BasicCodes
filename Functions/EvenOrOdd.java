package com.assignment4_functions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String output=evenodd(n);
        System.out.println(output);

    }
    static String evenodd(int n){
        if(n%2==0)
            return "Even";
        else return "Odd";
    }
}
