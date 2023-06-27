package com.interview.amazon;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            TreeNode value=null;
            for(int i=0;i<size;i++){
              value=queue.poll();
            if(value.left!=null){
                queue.add(value.left);
            }
            if(value.right!=null){
                queue.add(value.right);
                
            }
            
            
            
            }
            list.add(value.val);
                
        }
        return list;
    }
	
	
	//
	 public List<Integer> rightSideView1(TreeNode root) {
	        if (root == null) return new ArrayList<Integer>();
	        
	        ArrayDeque<TreeNode> nextLevel = new ArrayDeque() {{ offer(root); }};
	        ArrayDeque<TreeNode> currLevel = new ArrayDeque();        
	        List<Integer> rightside = new ArrayList();
	        
	        TreeNode node = null;
	        while (!nextLevel.isEmpty()) {
	            // prepare for the next level
	            currLevel = nextLevel;
	            nextLevel = new ArrayDeque<>();

	            while (! currLevel.isEmpty()) {
	                node = currLevel.poll();

	                // add child nodes of the current level
	                // in the queue for the next level
	                if (node.left != null) 
	                    nextLevel.offer(node.left);    
	                if (node.right != null) 
	                    nextLevel.offer(node.right);
	            }
	            
	            // The current level is finished.
	            // Its last element is the rightmost one.
	            if (currLevel.isEmpty()) 
	                rightside.add(node.val);    
	        }
	        return rightside;
	    }

}
