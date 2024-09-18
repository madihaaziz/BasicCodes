package com.BitwiseOperator;

public class MagicNumber {
    public static void main(String[] args) {

        int n=1110111101;
        StringBuilder a= new StringBuilder();
//        int y=n;
//        while(n>0){
//            a.append(n & 1);
//            n=n>>1;
//        }
//        int x=Integer.parseInt(String.valueOf(a.reverse()),2);
        System.out.println(a);
//        System.out.println(x);
    }
    public static int num(int n){
        int ans=0;
        int base=2;
        int power=0;
        while(n>0){
            ans+= (int) ((n&1)*Math.pow(base,power));
            n=n>>1;
            base*=base;
            power++;
        }
        return ans;
    }
}
