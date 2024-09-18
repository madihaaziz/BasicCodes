package com.BitwiseOperator;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(~5));
        System.out.println(findComplement(5));
    }
    public static int findComplement(int n) {
        int comp=~n;
        int mask=0;
        while(n!=0){
            mask=(mask<<1)|1;
            n=n>>1;
        }
        System.out.println(Integer.toBinaryString(mask));
        int ans=comp&mask;
        return ans;
    }
}
