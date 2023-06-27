package com.interview.amazon;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(13));

	}

	
		public static int trailingZeroes(int n) {
	        int count=0;
	        if(n==0){
	            return 0;
	        }
	        
	        for(int i=5;i<=n;i+=5){
	            int curr=i;
	            while(curr%5==0){
	                count++;
	                curr=curr/5;
	            }
	        }
	        return count;
	    }
        
    
		public int trailingZeroes1(int n) {
		    
		    int zeroCount = 0;
		    for (int i = 5; i <= n; i += 5) {
		        int powerOf5 = 5;
		        while (i % powerOf5 == 0) {
		            zeroCount += 1;
		            powerOf5 *= 5;
		        }
		    }
		    return zeroCount;
		}
}
