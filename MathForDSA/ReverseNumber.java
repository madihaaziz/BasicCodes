package com.MathForDSA;

public class ReverseNumber {
    public static void main(String[] args) {

        int n=-123;
        int y= -n;
        System.out.println(rev(y));
    }
    public static int rev(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return -rev;
    }
}
