package com.Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueenList {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        List<List<String>> liist=new ArrayList<>();
        System.out.println(queens(board,0,liist));
    }
    static List<List<String>> queens(boolean[][] board,int row,List<List<String>> outer){
        List<String> internal=new ArrayList<>();
        if(row==board.length){
            outer.add(internal);
            return outer;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                internal.add("Q");
                board[row][col]=true;
                outer.addAll(queens(board,row+1,outer));
                board[row][col]=false;
            }
            internal.add(".");
        }
        return outer;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col])
                return false;
        }
        //check left diagonal
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if (board[row-i][col-i])
                return false;
        }
        //check right diagonal
        int maxRight=Math.min(row,board.length-col-1);
        for (int i=1;i<=maxRight;i++){
            if (board[row-i][col+i])
                return false;
        }
        //if none of the conditions returns then queen is safe
        return true;
    }
}
