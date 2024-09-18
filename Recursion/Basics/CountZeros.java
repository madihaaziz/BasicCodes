package com.Recursion.Basics;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(zeros(3002004,0));
    }
    static int zeros(int n,int c){
        if(n==0)
            return c;
        if(n%10==0)
            c++;
        return zeros(n/10,c);
    }
}
