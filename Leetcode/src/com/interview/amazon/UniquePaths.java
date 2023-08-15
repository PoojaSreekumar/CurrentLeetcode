package com.interview.amazon;

import java.util.Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3, n = 7;
		
	}
	
	public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int[] k:dp){
            Arrays.fill(k,1);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

}
//0(n*m)