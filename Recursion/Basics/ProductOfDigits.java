package com.Recursion.Basics;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }
    public static int product(int n){
        if(n==1)
            return n;
        return n%10*product(n/10);
    }
}
