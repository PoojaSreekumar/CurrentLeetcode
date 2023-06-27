package com.interview.amazon;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
        //Stack<Integer> stack =new Stack<>();
        int diff=0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
           if(prices[i]<min){
               min=prices[i];
           }
           else if(prices[i]-min>diff){
               diff=prices[i]-min;
           }
        }
        return diff;
    }

}
