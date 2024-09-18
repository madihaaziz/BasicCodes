package com.MathForDSA;

public class SquareRoot {
    public static void main(String[] args) {

        double n=40;
        int p=3;
        System.out.printf("%.2f",newtonRaphson(n));
//        System.out.printf("Square root of %d is %.3f",n,sqrt(n,p));
    }
    public static double newtonRaphson(double n){
        double x=n;
        double root=0.0;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.001)
                break;
            x=root;
        }
        return root;
    }
    //time= O(log(n))
    static double sqrt(int n,int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n)
                return mid;
            if(mid*mid>n)
                e=mid-1;
            else
                s=mid+1;
        }
        double incr=0.1;
        for(int j=0;j<p;j++){
            while(root*root<=n){
                root+=incr;
            }
            root=root-incr;
            incr/=10;
        }
        return root;
    }
}
