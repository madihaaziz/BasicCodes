package com.Recursion.Basics;

public class CountMazeAllPaths {
    public static void main(String[] args) {
        int n=3,m=4;
        System.out.println(count(0,0,n,m));
    }
    public static int count(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int down=count(i+1,j,n,m);

        //move right
        int right=count(i,j+1,n,m);

        return down+right;
    }
}
