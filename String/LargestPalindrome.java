package com.String;

public class LargestPalindrome {
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        String c="";
        while(start<=end){

            if(s.charAt(start)!=s.charAt(end)){
                c="";
                end--;
                start++;
            }
            else{
                c+=s.charAt(start);
                start++;
                end++;
            }
        }
        return c;
    }
}
