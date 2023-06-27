package com.interview.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
	static class TreeNode {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tn=new TreeNode();
		new SymmetricTree().isMirror(root, root);

	}
	
	public boolean isMirror(TreeNode leftNode,TreeNode rightNode){
        if(leftNode==null&&rightNode==null){
            return true;
        }
        else if(leftNode==null||rightNode==null){
            return false;
        }
        boolean value=leftNode.val==rightNode.val;
        boolean first=isMirror(leftNode.left,rightNode.right);
        boolean second=isMirror(leftNode.right,rightNode.left);
        return value&&first&&second;
    }

	public boolean isSymmetric(TreeNode root) {
	       // return isMirror(root,root);
	        
	        Queue<TreeNode> q=new LinkedList<>();
	        if(root==null){
	            return true;
	        }
	        q.add(root.left);
	        q.add(root.right);
	        while(!q.isEmpty()){
	           TreeNode leftNode= q.poll();
	           TreeNode rightNode=q.poll();
	           if(rightNode==null&&leftNode==null){
	               continue;
	           }
	           if(leftNode==null||rightNode==null||leftNode.val!=rightNode.val){
	               return false;
	           }
	           
	               q.add(leftNode.left);
	               q.add(rightNode.right);
	               q.add(leftNode.right);
	               q.add(rightNode.left);
	           
	        }
	        return true;
	        
	    }
}
