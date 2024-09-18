package com.Recursion.Basics;

public class RevNum {
    static int sum=0;
    public static void rev(int n){
        if(n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(134321));
//        System.out.println(sum);
    }
    static boolean isPalindrome(int n){
        return n==rev2(n);
    }
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n)
            return n;
        int rem=n%10;
        return rem* (int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
