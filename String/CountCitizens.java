package com.String;

public class CountCitizens {
    public static void main(String[] args) {

    }
    public int countSeniors(String[] details) {
        int count=0;
        for(String str:details){
            String s=str.substring(11,13);
            int age=Integer.parseInt(s);
            if(age>60)
                count++;
        }
        return count;
    }
}
