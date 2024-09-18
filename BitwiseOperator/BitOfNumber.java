package com.BitwiseOperator;

public class BitOfNumber {
    public static void main(String[] args) {
        int n=20;
        int b=3;
        System.out.println(bit(n,b));
    }
    public static int bit(int n,int bi){
        return n&(1<<(bi-1));
    }
}
