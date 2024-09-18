package com.Recursion.Strings;

import java.util.ArrayList;

public class Phone2 {
    public static void main(String[] args) {
        System.out.println(phoneRet("","9"));
    }
    static ArrayList<String> phoneRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        if(digit<7){
            for(int i=(digit-2)*3;i<(digit-1)*3;i++){
                char ch=(char) ('a'+i);
                list.addAll(phoneRet(p+ch,up.substring(1)));
            }
        }
        if(digit==7){
            for(int i=(digit-2)*3;i<=(digit-1)*3;i++){
                char ch=(char) ('a'+i);
                list.addAll(phoneRet(p+ch,up.substring(1)));
            }
        }
        if(digit==8){
            for(int i=((digit-2)*3)+1;i<=(digit-1)*3;i++){
                char ch=(char) ('a'+i);
                list.addAll(phoneRet(p+ch,up.substring(1)));
            }
        }
        if(digit==9){
            for(int i=((digit-2)*3)+1;i<=((digit-1)*3)+1;i++){
                char ch=(char) ('a'+i);
                list.addAll(phoneRet(p+ch,up.substring(1)));
            }
        }
        return list;
    }
}
