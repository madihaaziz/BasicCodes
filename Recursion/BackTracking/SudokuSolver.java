package com.Recursion.BackTracking;

import java.util.Objects;

public class SudokuSolver {
    public static void main(String[] args) {

        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(solve(board));

    }
    static boolean solve(char[][] board){
        int n= board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            //if found some empty element in the sudoku break
            if (!emptyLeft)
                break;
        }
        //no empty element is left
        if (emptyLeft)
            //sudoku solved
            return true;
        //backtrack
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board,row,col,i)){
                board[row][col]=(char)(i+'0');
                if(solve(board)) {
                    //found the answer
                    display(board);
                    System.out.println();
                    return true;
                }
                else
                    //backtrack
                    board[row][col]='.';
            }
        }
        //none of the above returns means
        //sudoku can't be solved
        return false;
    }
    static void display(char[][] board){
        for(char[] row:board){
            for(char col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(char[][] board,int row,int col,int num){
        //check in the row
        char n=(char)(num+'0');
        for(int i=0;i< board.length;i++){
            if(board[row][i]==n)
                return false;
        }
        //check in the column
        for(char[] nums:board){
            if(nums[col]==n)
                return false;
        }
        //check in the box
        int sqrt=(int)Math.sqrt(board.length);
        int rowStart=row-row%(sqrt);
        int colStart=col-col%sqrt;
        for(int i=rowStart;i<rowStart+sqrt;i++){
            for(int j=colStart;j<colStart+sqrt;j++){
                if(board[row][i]==n)
                    return false;
            }
        }
        return true;
    }
}
