package com.interview.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode invertTree(TreeNode root) {
		// TreeNode rootToReturn=root;
		if (root == null) {
			return null;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		while (!que.isEmpty()) {
			TreeNode current = que.poll();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if (current.left != null) {
				que.add(current.left);
			}
			if (current.right != null) {
				que.add(current.right);
			}
		}
		return root;

	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	// 
	public TreeNode invertTree1(TreeNode root) {
    if (root == null) {
        return null;
    }
    TreeNode right = invertTree(root.right);
    TreeNode left = invertTree(root.left);
    root.left = right;
    root.right = left;
    return root;
}

}
