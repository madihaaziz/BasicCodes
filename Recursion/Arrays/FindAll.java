package com.Recursion.Arrays;

import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,4,5,6,4,7};
        int target=4;
//        findAllIndexes(arr,target,0);
        System.out.println(findInd(arr,4,0));
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndexes(int[] arr,int target,int index){
        if(index==arr.length)
            return;
        if(arr[index]==target)
            list.add(index);
        findAllIndexes(arr,target,index+1);
    }
    static ArrayList<Integer> findAll(int[] arr,int target,int index,ArrayList<Integer> list2){
        if(index==arr.length)
            return list2;
        if(arr[index]==target)
            list2.add(index);
        return findAll(arr,target,index+1,list2);
    }
    static ArrayList<Integer> findInd(int[] arr,int target,int index){
        ArrayList<Integer> l=new ArrayList<>();
        if(index==arr.length)
            return l;
        if(arr[index]==target)
            l.add(index);
        ArrayList<Integer> ansFromBelow=findInd(arr,target,index+1);
        l.addAll(ansFromBelow);
        return l;
    }
}
