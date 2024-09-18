package com.BitwiseOperator;

public class CountSetBits {
    public static void main(String[] args) {
        int n=45;
        int count=0;
//        while(n>0){
//            if((n & 1)==1)
//                count++;
//            n=n>>1;
//        }
        //2nd way to do it
//        while(n>0){
//            count++;
//            n=n-(n&-n);
//        }
        //3rd way to do it
        while(n>0){
            count++;
            n=n&(n-1);
        }
        System.out.println(count);
    }
}
