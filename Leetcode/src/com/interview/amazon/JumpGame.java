package com.interview.amazon;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,1,1,4};
		System.out.println(new JumpGame().canJump(nums));
	}
	
	public boolean canJump(int[] nums) {
        int last=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=last){
                last=i;
            }
        }
        return last==0;
    }

}


class Solution4 {
    public boolean canJump(int[] nums) {
       
    Index[] memo=new Index[nums.length];
    for(int i=0;i<nums.length;i++){
        memo[i]=Index.UNKNOWN;
    }
    memo[nums.length-1]=Index.GOOD;
    for (int i = nums.length - 2; i >= 0; i--) {
            int furthestJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthestJump; j++) {
                if (memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Index.GOOD;


}
}
enum Index{
    GOOD,BAD,UNKNOWN
}