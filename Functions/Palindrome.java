package com.assignment4_functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(palindrome(n));

    }
    static String palindrome(int n){
        int c=n;
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        if(rev==c)
            return "Palindrome";
        else return "Not a Palindrome";
    }
}
