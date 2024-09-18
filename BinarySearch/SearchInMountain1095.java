package com.BinarySearch;

public class SearchInMountain1095 {
    public static void main(String[] args) {

    }
    //leetcode 1095
    int search(int[] arr,int target){
        int peak=peakElement(arr);
        int first=orderAgnostic(arr,target,0,peak);
        if(first!=-1)
            return first;
        else
            return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int peakElement(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
                e=mid;
            else
                s=mid+1;
        }
            return s;
    }
    static int orderAgnostic(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            if(isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else{
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
