package com.interview.amazon;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer>list=new ArrayList<>();
        ListNode current=head,returnHead=head;
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int indexToBeRemoved=list.size()-n;
        ListNode prev=null,nextNode=null;
        int count=0;
        while(current!=null){
            if(count==indexToBeRemoved){
                if(current!=returnHead){
                    prev.next=current.next;
                    return returnHead;
                }
                else{
                    return returnHead.next;
                }
                

            }
            else{
                nextNode=current.next;
                prev=current;
                current=nextNode;
                count++;
            }
        }

        return null;
    }
	
	//
	
	public ListNode removeNthFromEnd1(ListNode head, int n) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    int length  = 0;
	    ListNode first = head;
	    while (first != null) {
	        length++;
	        first = first.next;
	    }
	    length -= n;
	    first = dummy;
	    while (length > 0) {
	        length--;
	        first = first.next;
	    }
	    first.next = first.next.next;
	    return dummy.next;
	}
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
}
