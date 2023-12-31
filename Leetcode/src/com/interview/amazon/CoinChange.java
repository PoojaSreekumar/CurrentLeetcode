package com.interview.amazon;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {186,419,83,408};
		int amount=6249;
		System.out.println(coinChange(nums,amount));

	}
	
	
        
		public static int coinChange(int[] coins, int amount) {
	        int[] dp=new int[amount+1];
	        Arrays.fill(dp,amount+1);
	        dp[0]=0;
	        
	        for(int i=1;i<=amount;i++){
	            for(int j=0;j<coins.length;j++){
	                if(coins[j]<=i){
	                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
	                }
	            }
	        }

	        return dp[amount]==(amount+1)?-1:dp[amount];

	        
	    }
	

}
