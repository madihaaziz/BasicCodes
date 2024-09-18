package com.BitwiseOperator;

public class SumOfRowPascalTriangle {
    public static void main(String[] args) {
        int n=4;
        System.out.println(sum(n));
    }
    public static int sum(int n){
        return 1<<(n-1);
    }
}
