package com.interview.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.interview.amazon.SymmetricTree.TreeNode;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        res=getAllElements(root,res);
        return res;
        
    }
    public List<List<Integer>> getAllElements(TreeNode current,List<List<Integer>> resList){
        
           Queue<TreeNode> queue=new LinkedList<>();
           
           
              
               if(current!=null){
                   queue.add(current);
                    
               }
               
           int level=0;
           while(!queue.isEmpty()){
               resList.add(new ArrayList<>());
               int size=queue.size();
               for(int i=0;i<size;i++){
                   TreeNode value=queue.remove();
                   resList.get(level).add(value.val);
                   if(value.left!=null){
                       queue.add(value.left);
                   }
                   if(value.right!=null){
                       queue.add(value.right);
                   }
               }
               
                   level++;
           }
           return resList;
                
        
    }
}


/*
class Solution {
List<List<Integer>> levels = new ArrayList<List<Integer>>();

public void helper(TreeNode node, int level) {
    // start the current level
    if (levels.size() == level)
        levels.add(new ArrayList<Integer>());

     // fulfil the current level
     levels.get(level).add(node.val);

     // process child nodes for the next level
     if (node.left != null)
        helper(node.left, level + 1);
     if (node.right != null)
        helper(node.right, level + 1);
}

public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) return levels;
    helper(root, 0);
    return levels;
}
}
*/