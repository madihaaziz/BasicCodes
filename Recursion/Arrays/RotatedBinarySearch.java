package com.Recursion.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,1};
        int target=0;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int s,int e){
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[s]<=arr[mid]){
            if(arr[s]<=target && arr[mid]>=target)
                return search(arr,target,s,mid-1);
            else
                return search(arr,target,mid+1,e);
        }
        if(arr[mid]<=target && target<=arr[e])
            return search(arr,target,mid+1,e);
        else
            return search(arr,target,s,mid-1);
    }
}
