package com.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,4,24,3,14,8,19};
        int target=3;
        System.out.println(find(arr,target,2,5));
    }
    static int find(int[] arr,int target,int start,int end){
        if(arr.length==0)
            return -1;
        //return the index if found
        for (int i = start; i < end; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
