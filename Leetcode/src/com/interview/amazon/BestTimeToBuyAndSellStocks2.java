package com.interview.amazon;

public class BestTimeToBuyAndSellStocks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		System.out.println(new BestTimeToBuyAndSellStocks2().maxProfit(prices));

	}
	public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        int diff=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min>diff){
                if(i<prices.length-1&&prices[i+1]<prices[i]){
                    profit=profit+prices[i]-min;
                    min=Integer.MAX_VALUE;
                    diff=0;


                }
                else if(i==prices.length-1){
                    profit=profit+prices[i]-min;
                }
                
                
            }
        }
        return profit;
    }
	
	public int maxProfit1(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
	
	public int maxProfit2(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

}
