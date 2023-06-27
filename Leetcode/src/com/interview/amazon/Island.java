package com.interview.amazon;

import java.util.Arrays;

public class Island {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums= {
				{1,1,1,1,1,1,1,0},
				{1,0,0,0,0,1,1,0},
				{1,0,1,0,1,1,1,0},
				{1,0,0,0,0,1,0,1},
				{1,1,1,1,1,1,1,0}
				};
		
		int[][] num= {
				{1,1,1,1,0},
				{1,1,0,1,0},
				{1,1,0,0,0},
				{0,0,0,0,0}
				};
		
//		["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
		System.out.println(new Island().countIsland(num));
	}
	
	public int countIsland(int nums[][]) {
		int count=0;
		int m=nums.length;
		int n=nums[0].length;
		boolean[][] visited=new boolean[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(nums[i][j]==0)
				{
					if(visitIsland(i,j,nums))
					{
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public boolean visitIsland(int i, int j, int[][] nums) {
		if(i >= nums.length || i < 0)
			return false;
		if(j >= nums[0].length || j < 0)
			return false;
		if(nums[i][j]!=0)
			return true;

		nums[i][j] = -2;
		
		boolean lower  = visitIsland(i+1,j,nums); 
		boolean up = visitIsland(i-1,j,nums); 
		boolean right = visitIsland(i,j+1,nums);
		boolean left = visitIsland(i,j-1,nums);
		
		return lower && up && right && left;
	}
}
