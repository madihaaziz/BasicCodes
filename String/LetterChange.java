package com.String;

public class LetterChange {
    public static void main(String[] args) {
        String str="Elephant";
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e' || str.charAt(i)=='E'){
                res+='i';
            }
            else
                res+=str.charAt(i);
        }
        System.out.println(res);
    }
}
