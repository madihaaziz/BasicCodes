package com.linearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {12,3,5,1},
                {6,51},
                {18,7,9},
                {14,24,31},
        };
        int target=24;
       // System.out.println(Arrays.toString(find(arr,target)));
        System.out.println(max(arr));
    }
    static int[] find(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max)
                    max = element;
            }
        }
        return max;
    }

}
