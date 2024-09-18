package com.Recursion.Strings;

public class RemoveString {
    public static void main(String[] args) {
        System.out.println(skipAppWord("bdapplefg"));
        System.out.println(skipAppWord("bdapplfg"));

    }
    static String skipWord(String up){
        if(up.isEmpty())
            return "";
        if(up.startsWith("apple"))
            return skipWord(up.substring(5));
        else
            return up.charAt(0)+skipWord(up.substring(1));
    }
    static String skipAppWord(String up){
        if(up.isEmpty())
            return "";
        if(up.startsWith("app") && !up.startsWith("apple"))
            return skipAppWord(up.substring(3));
        else
            return up.charAt(0)+skipAppWord(up.substring(1));
    }
}
