package com.Recursion.Strings;

import java.util.ArrayList;

public class kthDistinct {
    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        ArrayList<String> list=new ArrayList<>();
        for(String i:arr){
            int count =0;
            for (String s : arr) {
                if (i.equals(s)) {
                    count++;
                }
            }
            if(count==1){
                list.add(i);
            }
        }
        System.out.println(list.get(k-1));
    }
}
