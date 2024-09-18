package com.BinarySearch;

import javax.swing.*;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={1,3,5,8,9,20,24,33,45};
        int[] arr={99,87,67,46,22,11,6,3,-11};
        int target=22;
        System.out.println(orderAgnostic(arr,target));
    }
    static int orderAgnostic(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
