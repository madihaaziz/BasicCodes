package com.linearSearch;

public class findInString {
    public static void main(String[] args) {
        String str="Madiha";
        char c='c';
        if(find(str,c))
            System.out.println("Present");
        else System.out.println("Not present");
    }
    static boolean find(String str,char v){
        for(char x:str.toCharArray()){
            if(x==v)
                return true;
        }
        return false;
    }

}
