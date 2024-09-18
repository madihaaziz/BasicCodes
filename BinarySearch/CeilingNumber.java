package com.BinarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=1;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        if(target>arr[e])
            return -1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return arr[mid+1];
            else if(arr[mid]<target){
                s=mid+1;
            }
            else
                e=mid-1;
        }
        return arr[s];
    }
}
