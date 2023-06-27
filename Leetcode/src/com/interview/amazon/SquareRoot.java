package com.interview.amazon;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int mySqrt(int x) {
	    if (x < 2) return x;

	    int left = (int)Math.pow(Math.E, 0.5 * Math.log(x));
	    int right = left + 1;
	    return (long)right * right > x ? left : right;
	  }
	
	public int mySqrt1(int x) {
        if(x<2){
            return x;
        }
        int left=2,right=x/2,mid=0;
        long res=0;
        while(left<=right){
            mid=left+(right-left)/2;
            res=(long)mid*mid;
            if(res==x){
                return mid;
            }
            else if(res>x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return right;
	}}
