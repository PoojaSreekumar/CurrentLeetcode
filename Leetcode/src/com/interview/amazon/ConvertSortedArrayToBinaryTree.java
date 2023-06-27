package com.interview.amazon;

public class ConvertSortedArrayToBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums,0,nums.length-1);

        
    }

    public TreeNode createTree(int[] nums,int left, int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left=createTree(nums,left,mid-1);
        root.right=createTree(nums,mid+1,right);
        return root;
    }

    public class TreeNode {
    	     int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode() {}
    	      TreeNode(int val) { this.val = val; }
    	      TreeNode(int val, TreeNode left, TreeNode right) {
    	          this.val = val;
    	          this.left = left;
    	          this.right = right;
    	      }
    	  }
}
