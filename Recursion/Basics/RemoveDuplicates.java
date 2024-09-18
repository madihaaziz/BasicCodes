package com.Recursion.Basics;

public class RemoveDuplicates {
    public static boolean[] map=new boolean[26];

    public static void main(String[] args) {
        String str="abbccda";
        remove(str,0,"");
    }
    public static void remove(String str,int idx,String nString){
        if(idx==str.length()){
            System.out.println(nString);
            return;
        }
        char ch=str.charAt(idx);
        if (map[ch-'a']){
            remove(str,idx+1,nString);
        }
        else {
            nString+=ch;
            map[ch-'a']=true;
            remove(str,idx+1,nString);
        }
    }
}
