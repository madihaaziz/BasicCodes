package com.linearSearch;

public class Min {
    public static void main(String[] args) {
        int[] arr={13,21,4,35,19,9,46};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(i<min)
                min=i;
        }
        return min;
    }
}
