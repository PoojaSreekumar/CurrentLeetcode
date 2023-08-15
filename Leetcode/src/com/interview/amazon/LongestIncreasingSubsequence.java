package com.interview.amazon;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {10,9,2,5,3,7,101,18};
	}
	
	public int lengthOfLIS(int[] nums) {
        int[] pos=new int[nums.length];
        Arrays.fill(pos,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    pos[i]=Math.max(pos[i],pos[j]+1);
                }
            }
        }
        int longest=1;
        for(int n:pos){
            longest=Math.max(longest,n);
        }
        return longest;
        
       //O(N^2)
    }
	
	
	//
	public int lengthOfLIS1(int[] nums) {
    ArrayList<Integer> sub = new ArrayList<>();
    sub.add(nums[0]);
    
    for (int i = 1; i < nums.length; i++) {
        int num = nums[i];
        if (num > sub.get(sub.size() - 1)) {
            sub.add(num);
        } else {
            int j = binarySearch(sub, num);
            sub.set(j, num);
        }
    }
    
    return sub.size();
}

private int binarySearch(ArrayList<Integer> sub, int num) {
    int left = 0;
    int right = sub.size() - 1;
    int mid = (left + right) / 2;
    
    while (left < right) {
        mid = (left + right) / 2;
        if (sub.get(mid) == num) {
            return mid;
        }
        
        if (sub.get(mid) < num) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    
    return left;
}
//O(NlogN)

}
