package com.interview.amazon;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
	}
	
	public int trap(int[] height) {
        int len=height.length;
        if(len==1){
            return 0;
        }
        int min[]=new int[len];
        int max[]=new int[len];
        int leftMax=height[0];
        int rightMax=height[height.length-1];
        min[0]=height[0];
        max[len-1]=height[len-1];
        int ans=0;
        for(int i=1;i<len;i++){
           
            min[i]=leftMax;
             if(height[i]>leftMax){
                leftMax=height[i];
            }
        }

        for(int i=len-2;i>=0;i--){
            max[i]=rightMax;
            if(height[i]>rightMax){
                rightMax=height[i];
            }
        }
        for(int i=0;i<len;i++){
            int value= Math.min(min[i],max[i]);
            ans=ans+(value-height[i]<0?0: value-height[i]);
        }
        return ans;
    }

}
