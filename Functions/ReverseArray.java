package com.assignment4_functions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        RevArray(arr);
    }
    static void RevArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
