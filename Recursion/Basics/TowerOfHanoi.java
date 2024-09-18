package com.Recursion.Basics;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=1;
        toh(n,"S","H","D");
    }

    public static void toh(int n,String src,String help,String dest) {
        if(n==1){
            System.out.println("Transfer "+n+" from "+src+" to "+dest);
            return;
        }
        toh(n-1,src,dest,help);
        System.out.println("Transfer "+n+" from "+src+" to "+dest);
        toh(n-1,help,src,dest);
    }
}
