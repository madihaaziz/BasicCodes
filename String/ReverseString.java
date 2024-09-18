package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("lollipop@toffee.com");
//        reverse(str);
//        change(str);
        delete(str);
    }
    public static void reverse(StringBuilder str){
        for(int i=0;i<str.length()/2;i++){
            int back=str.length()-i-1;
            char first=str.charAt(i);
            char last=str.charAt(back);
            str.setCharAt(i,last);
            str.setCharAt(back,first);
        }
        System.out.println(str);
    }
    public static void change(StringBuilder str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='l')
                str.setCharAt(i,'z');
        }
        System.out.println(str);
    }
    static void delete(StringBuilder str){
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)=='@')
                str.delete(i,str.length());
        }
        System.out.println(str);
    }
}
