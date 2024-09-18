package com.MathForDSA;

public class Sieve {
    public static void main(String[] args) {

        int n=40;
        boolean[] arr=new boolean[n+1];
        seive(n,arr);
    }
    //false in array means is prime
    public static void seive(int n,boolean[] isPrimes){
        for(int i=2;i*i<=n;i++){
            //if value is true means factor of it is already visited in the past
            if(!isPrimes[i]){
                //if its false change all it's multiple to true
                for(int j=i*2;j<=n;j+=i){
                    isPrimes[j]=true;
                }
            }
        }
        for(int k=2;k<=n;k++){
            //print all the numbers whose value in the array is false
            if(!isPrimes[k])
                System.out.print(k+" ");
        }
    }
}
