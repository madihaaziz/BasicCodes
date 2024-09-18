package com.Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {

        System.out.println(seqRet("","abc"));
    }
    static ArrayList<String> seqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=seqRet(p+ch,up.substring(1));
        ArrayList<String> right=seqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
    static void seq(String p,String up){
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch=up.charAt(0);
        seq(p,up.substring(1));
        seq(p+ch,up.substring(1));
    }
}
