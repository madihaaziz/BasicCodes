package com.MathForDSA;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String[] args) {
        factors2(20);
    }

    //O(n)
    public static void factors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
    //O(sqrt(n))
    public static void factors2(int n){
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i)
                    System.out.print(i+ " ");
                else
                    System.out.print(i + " "+n/i+" ");
            }
        }
    }
    //both space ans time complexity will be O(sqrt(n))
    public static void factors3(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+ " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
