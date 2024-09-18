package com.BinarySearch;

public class countNegative {
    public static void main(String[] args) {
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int ub= grid[0].length-1;
        int lb=0;
        int c=0;
        while(lb<grid.length && ub>=0){
            if(grid[lb][ub]<0){
                c+=grid.length-lb;
                ub--;
            }
            else if(grid[lb][ub]>=0){
                lb++;
            }
        }
        return c;
    }
}
