package com.String;
import java.util.*;
public class StringPermutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printPermutation(str,"");
    }
    public static void printPermutation(String str,String ans){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            printPermutation(ros,ans+ch);
        }
    }
}
