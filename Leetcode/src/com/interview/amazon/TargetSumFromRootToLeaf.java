package com.interview.amazon;

public class TargetSumFromRootToLeaf {

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        
        targetSum=targetSum-root.val;
        if(root.left==null&&root.right==null){
            if(targetSum==0){
                return true;
            }
            else {
                return false;
            }
        }

        boolean left=hasPathSum(root.left,targetSum);
        boolean right=hasPathSum(root.right,targetSum);

        return left||right;  
    }
}

