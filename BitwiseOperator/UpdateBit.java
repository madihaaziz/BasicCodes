package com.BitwiseOperator;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if(oper==0){
            int newn=n^bitMask;
            System.out.println(newn);
        }
        else {
            System.out.println(n|bitMask);
        }
    }
}
