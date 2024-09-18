package com.BinarySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=1;
        System.out.println(floor(arr,target));

    }
    static int floor(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        if(target<arr[0])
            return -1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]>target)
                e=mid-1;
            else
                s=mid+1;
        }
        return arr[e];
    }
}
