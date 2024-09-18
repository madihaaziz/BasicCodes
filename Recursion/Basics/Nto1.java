package com.Recursion.Basics;

public class Nto1 {
    public static void main(String[] args) {
        OneToN(5);
        nTo1(5);
    }
    public static void nTo1(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        nTo1(n-1);
    }
    public static void OneToN(int n){
        if(n==0)
            return;
        OneToN(n-1);
        System.out.print(n+" ");
    }
    public static void both(int n){
        if(n==0)
            return;
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
