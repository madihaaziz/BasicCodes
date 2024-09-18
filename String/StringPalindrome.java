package com.String;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(check(str));
        System.out.println(isPalindrome(str));
    }
    static boolean check(String str){
        str=str.toLowerCase();
        int s=0;
        int n=str.length();
        int e=n-1;
        while(s<=e){
            if(str.charAt(s)==str.charAt(e)){
                s++;
                e--;
            }
            else
                break;
        }
        return s >= e;
    }
    static boolean isPalindrome(String str){
        if(str==null || str.isEmpty())
            return true;
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
}
