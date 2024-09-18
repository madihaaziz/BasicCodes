package com.linearSearch;

import java.util.Arrays;

public class BooleanList {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extra=3;
        boolean[] output=new boolean[candies.length];
        int max=0;
        for(int j:candies){
            if(j>max){
                max=j;
            }
        }
        for(int i=0;i<candies.length;i++){
            boolean ans=candy(candies[i],max,extra);
            output[i]=ans;
        }
        System.out.println(Arrays.toString(output));
    }
    static boolean candy(int i,int max,int extra){
        return i + extra >= max;
    }
}
