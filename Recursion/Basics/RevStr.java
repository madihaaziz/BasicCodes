package com.Recursion.Basics;

public class RevStr {
    public static void main(String[] args) {
        String str="abcd";
        String reve="";
        rev(str,str.length()-1,reve);
    }
    public static void rev(String str,int index,String reve){
        if(index<0){
            System.out.println(reve);
            return;
        }
        reve+=str.charAt(index);
        rev(str,index-1,reve);
    }
}
