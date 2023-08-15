package com.interview.amazon;

public class DeleteNodeInaBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class TreeNode {
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
		 
		
		    public TreeNode deleteNode(TreeNode root, int key) {
		        if(root==null){
		            return null;
		        }
		        if(key>root.val){
		            root.right=deleteNode(root.right,key);
		        }
		        else if(key<root.val){
		            root.left=deleteNode(root.left,key);
		        }
		        else{
		            if(root.right==null){
		                return root.left;
		            }
		            else if(root.left==null){
		                return root.right;
		            }
		            else{
		                int minVal=findMin(root.right);
		                root.val=minVal;
		                root.right= deleteNode(root.right,minVal);
		            }
		        }
		        return root;
		    }
		    public int findMin(TreeNode root){
		        int min=root.val;
		        while(root.left!=null){
		            root=root.left;
		            min=root.val;

		        }
		        return min;

		    }
		

}
