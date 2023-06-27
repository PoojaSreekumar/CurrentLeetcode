package com.interview.amazon;

public class SurroundedRegions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
				{'X','X','X','X'},
				{'X','O','O','X'},
				{'X','X','O','X'},
				{'X','O','X','X'}};
		new SurroundedRegions().solve(board);
		
		}

	
	
	 public void solve(char[][] board) {
	        int row=board.length;
	        int col=board[0].length;
	     //   boolean[][] visited=new boolean[row][col];
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                if(board[i][j]=='O'){
	                    boolean val=checkifSurrByX(board,i,j);
	                    if(val){
	                        set(board,i,j);
	                    }
	                    
	                    
	                    }
	                }
	            }
	        for(int i=0;i<row;i++){
	            for(int j=0;j<col;j++){
	                if(board[i][j]=='E'){
	                    board[i][j]='O';
	                }
	            }

	        }
	        

	    }
	    

	    public void set(char[][ ]board,int left,int right){
	        if(left<0||right>=board[0].length||left>=board.length||right<0){
	            return ;
	        }
	        if(board[left][right]=='X'){
	            return ;
	        }
	        board[left][right]='X';
	        set(board,left,right-1);
	        set(board,left,right+1);
	        set(board,left-1,right);
	        set(board,left+1,right);

	    }

	    public boolean checkifSurrByX(char[][] nums,int left,int right){
	        if(left<0||right>=nums[0].length||left>=nums.length||right<0){
	            return false;
	        }
	        if(nums[left][right]!='O'){

	            return true;
	        }
	        nums[left][right]='E';
	        
	        boolean leftVal=checkifSurrByX(nums,left,right-1);
	        boolean rightVal=checkifSurrByX(nums,left,right+1);
	        boolean top=checkifSurrByX(nums,left-1,right);
	        boolean bottom=checkifSurrByX(nums,left+1,right);
	        
	        return leftVal&&rightVal&&top&&bottom;

	    }

}
