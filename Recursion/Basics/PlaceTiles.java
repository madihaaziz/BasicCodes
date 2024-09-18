package com.Recursion.Basics;
//Place tiles of size 1xm in a floor of size nxm
public class PlaceTiles {
    public static void main(String[] args) {
        System.out.println(count(4,2));
    }
    public static int count(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertical=count(n-1,m);

        //horizontally
        int horizontal=count(n-m,m);

        return vertical+horizontal;
    }
}
