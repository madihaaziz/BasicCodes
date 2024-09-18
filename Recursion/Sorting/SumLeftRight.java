package com.Recursion.Sorting;

import java.util.ArrayList;
import java.util.List;

public class SumLeftRight {
    public static void main(String[] args) {

        int[] arr={1,2,3,4};
        int n=4;
        int left=1;
        int right=10;
        rangeSum(arr,n,left,right);
    }
    public static void rangeSum(int[] nums, int n, int left, int right) {
        List<List<Integer>> list=set(nums);
        for(List<Integer> integers : list) {
            System.out.println(integers);

        }
//        int sizeArr=n*n;
//        int[] arr=new int[sizeArr];
//        int i=0;
//        for(List<Integer> l:list){
//            int s=0;
//            for(int num:l){
//                s+=num;
//            }
//            arr[i]=s;
//            i++;
//        }
//        for(int no:arr){
//            System.out.print(no+" ");
//        }
//        sort(arr,0,arr.length-1);
//        int sum=0;
//        for(int j=left;j<=right;j++){
//            sum+=arr[j];
//        }
//        return sum;
    }

    public static void sort(int[] arr,int low,int high){
        if(low>=high)
            return;
        int s=low;
        int e=high;
        int mid=arr[s+(e-s)/2];
        while(s<=e){
            while(arr[s]<mid){
                s++;
            }
            while(arr[e]>mid){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
    public static List<List<Integer>> set(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int n:arr){
            int num=outer.size();
            for(int j=0;j<num;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                if(internal.isEmpty()){
                    internal.add(n);
                }
                for(int k=0;k<internal.size();k++){
                    if(internal.get(k)<n){
                        internal.add(n);
                    }
                }
                outer.add(internal);
            }
        }
        return outer;
    }
}
