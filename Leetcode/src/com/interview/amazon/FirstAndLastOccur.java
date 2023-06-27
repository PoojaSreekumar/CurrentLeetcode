package com.interview.amazon;

public class FirstAndLastOccur {
	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,10};
		int target = 8;
		int[] result= new FirstAndLastOccur().searchRange(nums, target);
		System.out.println(result[0]+" "+result[1]);
	}
	

	public int[] searchRange(int[] nums, int target) {
		/*
		int firstPos= findPosition(nums,0,nums.length-1,true,target);
		if(firstPos==-1) {
			return new int[] {-1,-1};
		}
		int lastPos= findPosition(nums,0,nums.length-1,false,target);
		return new int[] {firstPos,lastPos};
        */
		
		int[] result=searchRange_bin(nums, target);
		return result;
    }
	
	private int findPosition(int[] nums, int start, int end, boolean b,int target) {
		// TODO Auto-generated method stub
		
			if(end>=start) {
				int mid=start+(end-start)/2;
				if(b==true) {
					if(nums[mid]==target) {
						if(mid>0&&nums[mid-1]!=target) {
							return mid;
						}
						return findPosition(nums,start,mid-1,true,target);
					}
					else if(nums[mid]>target) {
						return findPosition(nums,start,mid-1,true,target);
					}
					else {
						return findPosition(nums,mid+1,end,true,target);
					}
				}
				else {
					if(nums[mid]==target) {
						if(mid!=nums.length-1&&nums[mid+1]!=target) {
							return mid;
						}
						return findPosition(nums,mid+1,end,false,target);
					}
					else if(nums[mid]>target) {
						return findPosition(nums,start,mid-1,false,target);
					}
					else {
						return findPosition(nums,mid+1,end,false,target);
					}
				}
				
			}
			return -1;
			
		}
	
	public int[] searchRange_lin(int[] nums, int target) {
		
		int findPos= findPosition(nums,0,nums.length-1,target);
		if(findPos == -1)
		{
			return new int[] {-1,-1};
		}
		int firstPos = findPos;
		while(firstPos >=0 && nums[firstPos] == target)
		{
			firstPos--;
		}
		firstPos++;
		
		int lastPos = findPos;
		while(lastPos <= nums.length-1 && nums[lastPos] == target)
		{
			lastPos++;
		}
		lastPos--;
		
		
		return new int[] {firstPos,lastPos};
    }
	
public int[] searchRange_bin(int[] nums, int target) {
		
		int findPos= findPosition(nums,0,nums.length-1,target);
		if(findPos == -1)
		{
			return new int[] {-1,-1};
		}
		
		int firstPos = findPos;
		int newFirstPos = firstPos;
		while(newFirstPos > 0)
		{
			newFirstPos = findPosition(nums,0,firstPos-1,target);
			if(newFirstPos != -1)
				firstPos = newFirstPos;
		}
		
		int lastPos = findPos;
		int newLastPos = lastPos;
		while(newLastPos > -1 && newLastPos < nums.length-1)
		{
			newLastPos = findPosition(nums,lastPos+1,nums.length-1,target);
			if(newLastPos != -1)
				lastPos = newLastPos;
		}
		
		
		return new int[] {firstPos,lastPos};
    }
	
	private int findPosition(int[] nums, int start, int end,int target) {
		// TODO Auto-generated method stub
		
			if(end<start) { return -1;}
				
				
				int mid = (start + end)/2;

					if(nums[mid]==target) {
						return mid;
					}
					else if(nums[mid]>target) {
						return findPosition(nums,start,mid-1,target);
					}
					else {
						return findPosition(nums,mid+1,end,target);
					}
		}
}
