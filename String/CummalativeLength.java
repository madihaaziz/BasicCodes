package com.String;

public class CummalativeLength {
    public static void main(String[] args) {
        String[] arr={"Madiha","Armaan","Shafaq"};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].length();
        }
        System.out.println(sum);
    }
}
