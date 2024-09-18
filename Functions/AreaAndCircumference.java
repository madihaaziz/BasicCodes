package com.assignment4_functions;

import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius= sc.nextInt();
        System.out.println("Area of the circle: "+area(radius));
        System.out.println("Circumference of the circle: "+circumference(radius));
    }
    static double area(int r){
        return 3.14*r*r;
    }
    static double circumference(int r){
        return 2*3.14*r;
    }
}
