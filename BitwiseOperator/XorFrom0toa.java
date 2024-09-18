package com.BitwiseOperator;

public class XorFrom0toa {
    public static void main(String[] args) {
        int a=9;
        System.out.println(xor(a));
    }
    public static int xor(int a){
        int ans;
        int rem=a%4;
        if(rem==0)
            return a;
        if (rem==1)
            return 1;
        if (rem==2)
            return a+1;
        return 0;
    }
}
