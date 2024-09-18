package com.assignment4_functions;

import java.util.Scanner;

public class PrimeInBetween {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ul= sc.nextInt();
        int ll= sc.nextInt();
        prime(ll,ul);

    }
    static void prime(int ll,int ul){
        for(int i=ll;i<=ul;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c+=1;
            }
            if(c==2)
                System.out.print(i+" ");
        }
    }
}
