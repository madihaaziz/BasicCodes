package com.String;

public class ConsistentString {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String i : words) {
            if (i.contains(allowed))
                count++;

        }
        return count;
    }
}
