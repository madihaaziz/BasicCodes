package com.assignment4_functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean val=isPrime(n);
        if(val)
            System.out.println("Prime");
        else System.out.println("Not Prime");
    }
    static boolean isPrime(int num){
        int c=2;
        while(c*c<=num){
            if(num%c==0)
                return false;
            else
                c+=1;
        }
        return true;
    }
}
