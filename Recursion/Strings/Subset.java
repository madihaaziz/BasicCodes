package com.Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
//        int[] arr={1,2,2};
//        List<List<Integer>> ans=setDuplicate(arr);
//        for(List<Integer> l:ans) {
//            System.out.println(l);
//        }
        double mid=(2+3)/2;
        System.out.println(mid);
    }
    //for duplicates in an array
    static List<List<Integer>> setDuplicate(int[] arr){
        //sort the array
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=0;
            if(i>0 && arr[i]==arr[i-1])
                s=e+1;
            e=outer.size()-1;
            int n=outer.size();
            for(int j=s;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> set(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
