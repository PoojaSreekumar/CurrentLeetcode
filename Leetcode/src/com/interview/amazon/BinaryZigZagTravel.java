package com.interview.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryZigZagTravel {

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
class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        zigzagPrint(root,list);
        return list;
        
    }

    private void zigzagPrint(TreeNode root,List<List<Integer>> list){
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            
           list.add(new ArrayList<Integer>());
            List<Integer> list1=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.remove();
                list1.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }
            if(level%2==1){
                Collections.reverse(list1);
            }
            
            list.get(level).addAll(list1);
            level++;

        }
    }
}