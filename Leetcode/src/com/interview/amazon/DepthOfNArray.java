package com.interview.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DepthOfNArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxDepth(Node root) {
	        if(root==null){
	            return 0;
	        }
	        else if(root.children.isEmpty()){
	            return 1;
	        }
	        else{
	            List<Integer> heightList=new ArrayList<>();
	            for(Node child:root.children){
	            int height=maxDepth(child);
	            heightList.add(height);
	        }
	        return Collections.max(heightList)+1;
	        }
	        
	    }

}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}