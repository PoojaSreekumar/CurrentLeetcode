package com.interview.amazon;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3};
		int val=3;
		int ret=new RemoveElement().removeElement(nums, val);
		for(int j=0;j<ret;j++) {
			System.out.println(nums[j]);
		}

	}
	
public int removeElement(int[] nums, int val) {
        
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            j++;
            count++;
        }
        return count;
    }

}
