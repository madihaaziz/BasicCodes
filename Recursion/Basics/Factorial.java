package com.Recursion.Basics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }
    public static int fact(int n){
        if(n==1)
            return n;
        return n*fact(n-1);
    }
}
