package com.Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
//        per("","abc");
//        System.out.println(perCount("","abc"));
//        ArrayList<String> list=perList("1234","");
//        System.out.println(list);
        List<String> list=new ArrayList<>();
        permu("abc","",list);
        System.out.println(list);
    }
    static void permu(String str,String perm,List<String> list){

        if(str.isEmpty()){
//            System.out.print(perm+" ");
            list.add(perm);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            permu(newString,perm+ch,list);
        }
    }
    static ArrayList<String> perList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            ans.addAll(perList(s+ch+f,up.substring(1)));
        }
        return ans;
    }
    static int perCount(String p,String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            count=count+perCount(f+ch+s,up.substring(1));
        }
        return count;
    }
    static void per(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            per(f+ch+s,up.substring(1));
        }
    }
}
