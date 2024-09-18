package com.Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        List<String> ls=new ArrayList<>();
        path("",board,0,0,ls);
        System.out.println(ls.size());
    }

    //Maze with obstacle at a particular cell if we reach that cell we can't
    // move forward so stop recursion at that particular cell

    static void path(String p, boolean[][] maze, int r, int c, List<String> ls){
        if(r== maze.length-1 && c==maze[0].length-1){
            ls.add(p);
            return;
        }
        if(!maze[r][c])
            return;
        if(r< maze.length-1){
            path(p+'D',maze,r+1,c,ls);
        }
        if(c < maze[0].length-1){
            path(p+'R',maze,r,c+1,ls);
        }
    }
}
