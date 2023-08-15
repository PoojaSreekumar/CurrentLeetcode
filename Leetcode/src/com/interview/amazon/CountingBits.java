package com.interview.amazon;

public class CountingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;

	}
	
	public int[] countBits(int n) {
        int[] result=new int[n+1];
        result[0]=0;
        for(int i=1;i<=n;i++){
            int count=0;
            int val=i;
            while(val!=0){
                val=val&val-1;
                count++;
            }
            result[i]=count;
        }
        return result;
    }
	/*
	 * O(n⋅logn). 
	 * For each integer xxx, in the worst case, 
	 * we need to perform O(log⁡n)O(\log n)O(logn) operations,
	 *  since the number of bits in xxx equals to log⁡x+1\log x + 1logx+1 
	 *  and all the bits can be equal to 111. However, on average, 
	 *  each bit will be set n/2n / 2n/2 times, so for each integer xxx 
	 *  we will perform log⁡(x)/2\log (x) / 2log(x)/2 operations, 
	 *  therefore, in total, 
	 *  it will cost O(n⋅log⁡(n)/2)O(n \cdot \log (n) / 2)O(n⋅log(n)/2) operations.
	 */
	
	
	//)=0(n)
	public int[] countBits1(int num) {
    int[] ans = new int[num + 1];
    for (int x = 1; x <= num; ++x) {
        ans[x] = ans[x & (x - 1)] + 1;
    }
    return ans;
}
	
	 public int[] countBits2(int n) {
	        int[] ans = new int[n + 1];
	        for (int x = 1; x <= n; ++x) {
	            // x / 2 is x >> 1 and x % 2 is x & 1
	            ans[x] = ans[x >> 1] + (x & 1); 
	        }
	        return ans;
	    }

}
