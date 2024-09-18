package com.Recursion.Basics;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    public static int sum(int n){
        if(n==1)
            return n;
        return n%10+sum(n/10);
    }
}
