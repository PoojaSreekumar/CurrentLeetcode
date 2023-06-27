package com.interview.amazon;

public class TwoSumSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2,7,11,15};
		int target=9;
		
	}
	
	public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(high>low){
            int sum=numbers[low]+numbers[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }
            else if(sum>target){
                high--;
            }
            else{
                low++;
            }
        }
        
        return new int[]{-1,-1};
    }

}
