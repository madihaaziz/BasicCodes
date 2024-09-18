package com.BinarySearch;

import java.util.Arrays;

public class Sorted2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=33;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int lb=0;
        int ub=arr.length-1;
        while(lb<arr.length && ub>=0){
            if(arr[lb][ub]==target)
                return new int[]{lb,ub};
            else if(arr[lb][ub]>target)
                ub--;
            else
                lb++;
        }
        return new int[]{-1,-1};
    }
}
