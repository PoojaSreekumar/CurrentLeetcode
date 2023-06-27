package com.interview.amazon;

public class JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int jump(int[] nums) {
        int maxJump=0;
        
        int ans=0;
        int length=nums.length-1;
        int left=0;
        int right=0;
        while(right<length){
            
            for(int i=left;i<=right;i++){
                maxJump=Math.max(maxJump,i+nums[i]);
            }
            left=right+1;
            right=maxJump;
            ans++;
        }
        return ans;
    }

}
