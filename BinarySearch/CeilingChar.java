package com.BinarySearch;

public class CeilingChar {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='j';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        if((int)target>=(int)(letters[e]))
            return letters[0];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]==(target))
                return letters[mid+1];
            else if((int)letters[mid]<(int)target)
                s=mid+1;
            else
                e=mid-1;
        }
        return letters[s];
    }
}
