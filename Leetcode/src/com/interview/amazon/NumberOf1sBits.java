package com.interview.amazon;

public class NumberOf1sBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( new NumberOf1sBits().hammingWeight(31));
	}
	
	public int hammingWeight(int n) {
        int count=0;
        while(n!=0) {
        	count++;
        	n=n&(n-1);
        }
        return count;
    }
	
	/*We can make the previous algorithm simpler and a little faster.
	 *  Instead of checking every bit of the number, we repeatedly flip the 
	 *  least-significant 111-bit of the number to 000, and add 111 to the sum. 
	 *  As soon as the number becomes 000, we know that it does not have any more 111-bits, 
	 *  and we return the sum.

The key idea here is to realize that for any number nnn, 
doing a bit-wise AND of nnn and n−1n - 1n−1 flips the least-significant 111-bit in nnn to 000
*/
	
	public int hammingWeight1(int n) {
		int mask=1;
        int count=0;
        for(int i=0;i<32;i++) {
        	if((n&mask)!=0) {
        		count++;
        	}
        	mask=mask<<1;
        }
        return count;
    }
	
	

}
