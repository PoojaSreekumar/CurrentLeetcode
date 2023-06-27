package com.interview.amazon;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        	if(c=='{'||c=='('||c=='[') {
        		stack.push(c);
        	}
        	else {
        		if(c=='}'&&!stack.isEmpty()&&stack.peek()=='{') {
        			stack.pop();
        		}
        		else if(c==']'&&!stack.isEmpty()&&stack.peek()=='[') {
        			stack.pop();
        		}
        		else if(c==')'&&!stack.isEmpty()&&stack.peek()=='(') {
        			stack.pop();
        		}
        		else
        			return false;
        		
        	}
        }
        return stack.isEmpty();
        
    }

}
