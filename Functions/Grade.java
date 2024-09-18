package com.assignment4_functions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks= sc.nextInt();
        System.out.println(grade(marks));
    }
    static String grade(int n){
        if(n<=100 && n>90)
            return "AA";
        if(n<=90 && n>80)
            return "AB";
        if(n<=80 && n>70)
            return "BB";
        if(n<=70 && n>60)
            return "BC";
        if(n<=60 && n>50)
            return "CD";
        if(n<=50 && n>40)
            return "DD";
        else return "Fail";
    }
}
