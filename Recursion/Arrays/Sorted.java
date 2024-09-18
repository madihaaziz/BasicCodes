package com.Recursion.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,11,8,9};
        int s=0;
        System.out.println(checkSort(arr,s));
    }
    public static boolean checkSort(int[] arr,int s){
        if(s==arr.length-1)
            return true;
        return (arr[s]<arr[s+1])&& checkSort(arr,s+1);
    }
}
