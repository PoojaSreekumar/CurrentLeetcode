package com.interview.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KthSmallestElementInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        return list.get(k-1);
    }

    public void inOrder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        if(root!=null){
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);

        }
    }
    
    //
    
    public int kthSmallest1(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (true) {
          while (root != null) {
            stack.push(root);
            root = root.left;
          }
          root = stack.pop();
          if (--k == 0) return root.val;
          root = root.right;
        }
      }

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
