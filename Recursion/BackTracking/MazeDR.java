package com.Recursion.BackTracking;

public class MazeDR {
    public static void main(String[] args) {
//        path("",3,3);
        System.out.println(count(51,9));
    }
    //Maze where we can go only D(down), R(right)
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static int count(int r,int c){
        if(r==1 || c==1)
            return 1;
        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }
}
