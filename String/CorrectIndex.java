package com.String;

import java.util.Arrays;

public class CorrectIndex {
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        int j=Integer.parseInt(s.replaceAll("[^0-9]",""));
        // String k=s.replaceAll("[^0-9]"," ");
        int k=j;
        int count=0;
       while(k>0){
           k=k/10;
           count++;
       }
       int[] arr=new int[count];
       for(int i=0;i<count;i++){
           arr[count-i-1]=j%10;
           j=j/10;
       }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if((int)ch>48 && (int)ch<=57)
                sb.delete(i,i+1);
        }
        s=sb.toString();
        String[] ss=s.split(" ");

        int l=0;

        System.out.println(Arrays.toString(ss));
        System.out.println(Arrays.toString(arr));
    }
//    public String sortSentence(String s) {
//        // List<Integer> l=new ArrayList<>();
//        int j=Integer.parseInt(s.replaceAll("[^0-9]",""));
//        // String k=s.replaceAll("[^0-9]"," ");
//        int[] arr=new int[j];
//        StringBuilder sb=new StringBuilder(s);
//        int k=sb.indexOf(" ");
//        sb.delete(k-1,k+1);
//    }
}
