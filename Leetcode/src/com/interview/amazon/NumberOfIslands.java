package com.interview.amazon;

public class NumberOfIslands {
	/*
	 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or 
vertically. You may assume all four edges of the grid are all surrounded by water.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char[][] num= {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
				};
		System.out.println(new NumberOfIslands().numIslands1(num));
	}
	
	public int numIslands1(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') {
                	count++;
                	isIsland1(i,j,grid);
                	
                }
            }
        }
        return count;

    }
	
	
	
	public void isIsland1(int i,int j,char[][] grid) {
		if(i>=grid.length||i<0||j<0||j>=grid[0].length) {
			return ;
		}
		if(grid[i][j]!='1') {
			return ;
		}
		grid[i][j]='0';
		isIsland(i,j-1,grid);
		isIsland(i,j+1,grid);
		isIsland(i-1,j,grid);
		isIsland(i+1,j,grid);
		
		
		
	}

	public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') {
                	if(isIsland(i,j,grid)) {
                		count++;
                	}
                	
                }
            }
        }
        return count;

    }
	
	
	
	public boolean isIsland(int i,int j,char[][] grid) {
		if(i>=grid.length||i<0||j<0||j>=grid[0].length) {
			return true;
		}
		if(grid[i][j]!='1') {
			return true;
		}
		grid[i][j]='2';
		boolean left=isIsland(i,j-1,grid);
		boolean right=isIsland(i,j+1,grid);
		boolean top=isIsland(i-1,j,grid);
		boolean bottom=isIsland(i+1,j,grid);
		return left&right&top&bottom;
		
	}

}
