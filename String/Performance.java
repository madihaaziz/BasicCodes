package com.String;

public class Performance {
    public static void main(String[] args) {
//        String series="";
//        for(int i=0;i<26;i++){
//            char ch=(char)('a'+i);
//            series+=ch;//everytime its creating new object wastage of storage
//        }
//        System.out.println(series);
        //Can be optimized using StringBuilder class
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
