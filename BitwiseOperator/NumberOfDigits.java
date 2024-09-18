package com.BitwiseOperator;

import java.util.Arrays;

public class NumberOfDigits {
    public static void main(String[] args) {
//        System.out.println(digit(1));
//        System.out.println(xorNum(1,4));
        int n=5;
        int a=~n;
        System.out.println(a);
    }
    public static int xorNum(int x,int y){
        int c=0;
        int a=x^y;
        while(a>0){
            if((a&1)==1){
                c++;
            }
            a=a>>1;
        }
        return c;
    }
    public static void countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            int a=digit(i);
            arr[i]=a;
        }
        System.out.println(Arrays.toString(arr));
    }
    static int digit(int n){
        return (int)(Math.log(n)/Math.log(2))+1;
    }
}
