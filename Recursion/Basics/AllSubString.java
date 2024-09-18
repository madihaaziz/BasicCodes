package com.Recursion.Basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AllSubString {
    public static List<String> list=new ArrayList<>();

    public static void subseq(String str, int i, String ns, HashSet<String> set){
        if(i==str.length()){
            if (!set.contains(ns)) {
                list.add(ns);
                set.add(ns);
            }
            return;
        }
        char ch=str.charAt(i);
//        if(!ns.contains(ch)){
//            subseq(str,i+1,ns+ch,set);
//        }
//        else{
//            subseq(str,i+1,ns,set);
//        }

    }
    public static void main(String[] args) {
        String str="abcabcbb";
        HashSet<String> set=new HashSet<>();
        subseq(str,0,"",set);
        System.out.println(list);
    }
}
