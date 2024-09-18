package com.Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,3,1,8,2};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr,int r,int c,int max){
        if(r==0)
            return;
        if(c<r){
            //get the max in each recursion
            if(arr[c]>arr[max])
                selection(arr,r,c+1,c);
            else
                selection(arr,r,c+1,max);
        }
        else{
            //swap
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            //get the next max element and repeat
            selection(arr,r-1,0,0);
        }
    }
}
