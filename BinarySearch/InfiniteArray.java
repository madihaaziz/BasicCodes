package com.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,10,11,12,15,20,23,30,33,35};
        int target=15;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=1;
        //if target>arr[end] increasing the box size
        while(target>arr[end]){
            //new start
            int temp=end+1;
            //new end
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
