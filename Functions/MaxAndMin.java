package com.assignment4_functions;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max=Max(a,b,c);
        int min=Min(a,b,c);
        System.out.println("Maximum: "+max+" Minimum: "+min);

    }
    static int Max(int x,int y,int z){
        if(x>y && x>z)
            return x;
        else if(y>x && y>z)
            return y;
        else
            return z;
    }
    static int Min(int x,int y,int z){
        if(x<y && x<z)
            return x;
        else if(y<x && y<z)
            return y;
        else
            return z;
    }
}
