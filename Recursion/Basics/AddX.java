package com.Recursion.Basics;

public class AddX {
    public static void main(String[] args) {
        String str="axbcxxd";
        String newS="";
//        String s=addx(str,newS,0,0);
//        System.out.println(s);
        addx(newS,str,0,0);
    }
    public static void addx(String newS,String str,int idx,int count){
        if(idx==str.length()){
            for (int i=0;i<count;i++){
                newS+='x';
            }
            System.out.println(newS);
            return;
        }
        char ch=str.charAt(idx);
        if(ch=='x'){
            count++;
            addx(newS,str,idx+1,count);
        }
        else{
            newS+=ch;
            addx(newS,str,idx+1,count);
        }
    }
}
