package com.Recursion.Basics;

import java.util.HashSet;
import java.util.Objects;

public class StringSubSequence {
    public static boolean c=false;
    public static void main(String[] args) {
        String s="2";
        System.out.println();
//        String str="axc";
//        String t="ahbgdc";
//        check(str,0,"",t);
//        System.out.println(c);
//        HashSet<String> set=new HashSet<>();
//        check2("aaa",0,"",set);
//        check(str,0,"","bag");
//        System.out.println(numDistinct(str,"bag"));
    }
    //for different characters
    public static void check(String s,int i,String ns,String t){
        if(i==t.length()){
            if(ns.equals(s)){
                c=true;
                return;
            }
            return;
        }
        char ch=t.charAt(i);

        check(s,i+1,ns+ch,t);
        check(s,i+1,ns,t);
    }
    //if characters are same
    public static void check2(String s, int i, String ns, HashSet<String> set){
        if(i==s.length()){
            if(set.contains(ns)){
                return;
            }
            else {
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }
        char ch=s.charAt(i);

        check2(s,i+1,ns+ch, set);
        check2(s,i+1,ns, set);
    }

//    public static void subsequences(String str,int idx,String newString,String target){
//        if(idx==str.length()){
//            if(newString.equals(target)) {
//                c++;
////                System.out.print(newString + " ");
//                return;
//            }
//            return;
//        }
//        char ch=str.charAt(idx);
//        //add to new string
//        subsequences(str,idx+1,newString+ch,target);
//        //don't add to new string
//        subsequences(str,idx+1,newString,target);
//    }
}
