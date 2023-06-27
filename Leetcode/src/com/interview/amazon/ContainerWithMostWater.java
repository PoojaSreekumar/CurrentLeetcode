package com.interview.amazon;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights= {1,8,6,2,5,4,8,3,7};
		System.out.println(new ContainerWithMostWater().maxArea(heights) );

	}

	public int maxArea(int[] height) {
	       
	        int low=0;
	        int high=height.length-1;
	        int maxVol=0;
	       
	        while(low<high){
	            int vol=Math.min(height[low],height[high])*(high-low);
	            if(vol>maxVol){
	                maxVol=vol;
	            }
	            if(height[low]<height[high]){
	                low++;
	            }
	            else
	                high--;

	        }
	        return maxVol;
	    }
}
