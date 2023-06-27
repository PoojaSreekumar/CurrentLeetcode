package com.interview.amazon;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public boolean isValidSudoku(char[][] board) {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
               boolean row= h.add(board[i][j]+" is in row"+i);
                boolean column=h.add(board[i][j]+" is in column"+j);
               boolean box= h.add(board[i][j]+" is in box"+i/3+" "+j/3);
               if(!row||!column||!box){
                   return false;
               }
            }
        }
        return true;
    }

}
