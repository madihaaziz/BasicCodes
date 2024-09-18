package com.Recursion.BackTracking;

public class ValidSudoku {
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
        System.out.println(valid(board));
    }
    static boolean valid(char[][] board){
        int row=-1;
        int col=-1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    int ch=board[i][j]-'0';
                    row=i;
                    col=j;
                    if(!isSafe(board,row,col,ch)){
                        return true;
                    }
                }
            }
        }
        return false;
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
