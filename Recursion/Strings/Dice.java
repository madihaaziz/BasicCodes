package com.Recursion.Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(di("",4));
    }
    static ArrayList<String> di(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            if(!p.isEmpty())
                list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(di(p+i,target-i));
        }
        return list;
    }
}
