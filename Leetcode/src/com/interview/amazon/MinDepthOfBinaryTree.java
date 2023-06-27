package com.interview.amazon;

public class MinDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int minDepthV=Integer.MAX_VALUE;
        if(root.left!=null)
         minDepthV=Math.min(minDepth(root.left),minDepthV);
         if(root.right!=null)
         minDepthV=Math.min(minDepth(root.right),minDepthV);
         return minDepthV+1;
    }
}