package com.interview.amazon;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public void rotate(int[] nums, int k) {
	        int length=nums.length;
	        k=k%length;
	        

	        if(k==0){
	            return ;
	        }
	    int first=length-k;
	/*
	 * correct but time exceeded

	        for(int p=0;p<k;p++){
	            int temp=nums[length-1];
	            int i=length-1;
	            while(i>0){
	                nums[i]=nums[--i];
	            }
	            nums[0]=temp;
	        }

	*/




	        int temp[]=new int[k];
	        for(int i=first,j=0;i<nums.length;i++){
	            temp[j++]=nums[i];
	            
	        }
	        int m=1;
	        for(int j=first-1;j>=0;j--){
	            nums[nums.length-m]=nums[j];
	            m++;
	        }
	        for(int l=0;l<k;l++){
	            nums[l]=temp[l];
	        }
	        
	    }
}


//
/*
 * Original List                   : 1 2 3 4 5 6 7

After reversing all numbers     : 7 6 5 4 3 2 1

After reversing first k numbers : 5 6 7 4 3 2 1

After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
 */
class Solution35 {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }
  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}