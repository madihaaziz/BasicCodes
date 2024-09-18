package com.Recursion.Basics;

public class Occurence {
    public static int first=-1;
    public static int last=-1;
    public static void main(String[] args) {
        String str="abaacdaaha";
        findOccur(str,0,'a');
//        String s="abcd";
//        String[] src={"a","cd"};
//        int[] idx={0,2};
//        String[] target={"eee","fff"};
//        for(int i=0;i<idx.length;i++){
//            if(s.substring(idx[i],src[i].length()).equals(src[i])){
//                s=s.replaceAll(s.substring(idx[i],src[i].length()),src[i]);
//                System.out.println(s);
//            }
//        }

//        int idx=s.lastIndexOf(" ");
//        String str=s.substring(idx+1);
//        System.out.println(str.length());

    }
    public static void findOccur(String str,int idx,char ele){
        if(idx==str.length()){
            if(first!=-1 && last==-1){
                last=first;
            }
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==ele){
            if (first==-1)
                first=idx;
            else
                last=idx;
        }
        findOccur(str,idx+1,ele);
    }

}
