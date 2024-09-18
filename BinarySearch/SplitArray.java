package com.BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int[] arr,int m){
        int s=0;
        int e=0;
        for(int i=0;i<arr.length;i++){
            s=Math.max(s,arr[i]);
            e+=arr[i];
        }
        while(s<e){
            int mid=s+(e-s)/2;
            int sum=0;
            int pieces=1;
            for(int  num:arr){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>m)
                s=mid+1;
            else
                e=mid;
        }
        return s;
    }
}
