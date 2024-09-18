package com.Recursion.Basics;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5};
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] arr,int idx){
        if(idx== arr.length-1)
            return true;
        if(arr[idx]<arr[idx+1])
            return check(arr,idx+1);
        else return false;
    }
}
