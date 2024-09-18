package com.BinarySearch;

import java.util.Arrays;

public class Array2DSorted {
    public static void main(String[] args) {
        int[][] arr={{1}};
        int target=1;
        System.out.println(Arrays.toString(sortedMatrix(arr,target)));
    }
    //simple binary search
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int cMid=cStart+(cEnd-cStart)/2;
            if(matrix[row][cMid]==target)
                return new int[]{row,cMid};
            else if(matrix[row][cMid]<target)
                cEnd=cMid-1;
            else
                cStart=cMid+1;
        }
        return new int[]{-1,-1};
    }

    static int[] sortedMatrix(int[][] matrix,int target){
        int r=matrix.length;
        int col=matrix[0].length;
        //matrix contains only 1 row
        if(r==1)
            return binarySearch(matrix,0,0,col-1,target);

        int rStart=0;
        int rEnd=r-1;
        int cMid=col/2;
        //if the condition is false that means only 2 rows are left to check
        while(rStart<rEnd-1){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
                return new int[]{mid,cMid};
            else if(matrix[mid][cMid]>target)
                rEnd=mid;
            else
                rStart=mid;
        }
        //checking two rows of mid column
        if(matrix[rStart][cMid]==target)
            return new int[]{rStart,cMid};
        if(matrix[rStart+1][cMid]==target)
            return new int[]{rStart+1,cMid};
        //checking for the last 4 parts
        //1st part
        if(matrix[rStart][cMid-1]>=target)
            return binarySearch(matrix,rStart,0,cMid-1,target);
        //2nd part
        else if(matrix[rStart][cMid+1]<=target && target<=matrix[rStart][col-1])
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        //3rd part
        else if(matrix[rStart+1][cMid-1]>=target)
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        //4th part
        else
            return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
    }
}
