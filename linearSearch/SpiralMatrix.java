package com.linearSearch;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        ArrayList<Integer> list=new ArrayList<>();
        final int m=matrix.length;
        final int n=matrix[0].length;
        int r1=0;
        int c1=0;
        int r2=m-1;
        int c2=n-1;
        while(list.size()<m*n){
            for(int i=c1;i<=c2 && list.size()<m*n;++i)
                list.add(matrix[r1][i]);
            for(int j=r1+1;j<=r2-1 && list.size()<m*n;++j)
                list.add(matrix[j][c2]);
            for(int i=c2;i>=c1 && list.size()<m*n;--i)
                list.add(matrix[r2][i]);
            for(int j=r2-1;j>=r1+1 && list.size()<m*n;--j)
                list.add(matrix[j][c1]);
            ++r1;
            ++c1;
            --r2;
            --c2;
        }
        System.out.println(list);
    }
}
