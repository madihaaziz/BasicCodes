package com.Recursion.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int[] arr={1,1,1,2,2,2,3,3,};
        for(int i:arr){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        System.out.println(set);
    }

}
