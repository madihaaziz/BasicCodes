package com.Recursion.Basics;

public class NumberOfSteps {
    public static void main(String[] args) {
        int n=14;
        System.out.println(number(n,0));
    }
    public static int number(int n,int count){
        if(n==1)
            return count+1;
        if(n%2==0)
            return number(n/2,count+1);
        return number((n-1)/2,count+2);
    }
}
