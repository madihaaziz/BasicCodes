package com.linearSearch;

public class findElement {
    public static void main(String[] args) {
        int[] arr={23,19,3,4,12,14};
        int target=3;
        System.out.println(find(arr,target));
    }
    static int find(int[] arr,int target){
        if(arr.length==0)
            return -1;
        //return the element
        /*
        for(int element:arr){
            if(element==target)
                return element;
        }*/
        //return the index if found
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;

    }
}
