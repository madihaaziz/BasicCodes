package com.Recursion.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr={4,3,6,1,8,7};
        int target=3;
        System.out.println(search2(arr,target,0));
    }
    //return whether present or not i.e. true or false
    public static boolean search(int[] arr,int target,int index){
        if(index==arr.length)
            return false;
        return arr[index]==target || search(arr,target,index+1);
    }
    //return the index if present
    public static int search2(int[] arr,int target,int index){
        if(index==arr.length)
            return -1;
        if(arr[index]==target)
            return index;
        return search2(arr,target,index+1);
    }
}
