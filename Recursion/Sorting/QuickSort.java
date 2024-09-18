package com.Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4,3,7,1,9,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        while(s<=e){
            while(arr[s]<arr[mid])
                s++;
            while (arr[e]>arr[mid])
                e--;
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //pivot it correct position
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
