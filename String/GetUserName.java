package com.String;

import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String str= sc.nextLine();
        String userName="";
        int index=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@')
                index=i;
        }
        userName=str.substring(0,index);
        System.out.println(userName);
    }
}
