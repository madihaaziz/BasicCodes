package com.MathForDSA;

public class Power2 {
    public static void main(String[] args) {
        double x=2;
        int n=-2;
        double ans=1/pow2(x,n);
        System.out.println(ans);

    }
    public static int pow(int x,int n){
        if(x==0)
            return 0;
        if(n==0){
            return 1;
        }
        x*=pow(x,n-1);
        return x;
    }
    public static double pow2(double x,int n){
        if(x==0)
            return 0;
        if(n==0)
            return 1.00;
        x*=pow2(x,n+1);
        return x;
    }
}
