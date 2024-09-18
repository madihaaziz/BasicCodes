package com.Recursion.Basics;

public class Sum {
    public static void main(String[] args) {
        System.out.println(check(38));
    }
    public static int check(int num){
        if(num<10)
            return num;
        return anss(num);
    }
    public static int anss(int num){
        if(num<10)
            return num;
        int ans=0;
        while(num>0){
            ans+=num%10;
            num=num/10;
        }
        return anss(ans);
    }
}
