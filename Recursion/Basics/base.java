package com.Recursion.Basics;

public class base {
    public static void main(String[] args) {
//        System.out.println(560%100);
//        int i=9;
//        char ch=(char)(i-'0');
//        System.out.println(ch);
//        int[] arr={9,8,7,6,5,4,3,2,1,0};
//        System.out.println(moun(arr));
        String s=" ";
        String[] token=s.trim().split(" ");
        System.out.println("¥");
    }
    public static boolean moun(int[] arr){
        int s=0;
        int e=arr.length-1;
        int m=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                m=mid;
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
                s=mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
                e=mid;
        }
        int i=0;
        while(i<m){
            if(arr[i]<arr[i+1]){
                i++;
            }
            else{
                return false;
            }
        }
        int j=arr.length-1;
        int k=m;
        while(k<j){
            if(arr[k]>arr[k+1]){
                k++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
