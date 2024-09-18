package com.assignment4_functions;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        System.out.println(checkEligibility(age));

    }
    static String checkEligibility(int a){
        if(a>=18)
            return "Eligible";
        else return "Not Eligible";
    }
}
