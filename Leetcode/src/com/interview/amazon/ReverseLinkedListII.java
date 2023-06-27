package com.interview.amazon;


//import com.interview.amazon.RotateList.ListNode;

public class ReverseLinkedListII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

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

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution22 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null;
        ListNode headToReturn=head;
        int count=1;
        ListNode current=null;
        while(head!=null){
            if(count==left){
                current=reverse(head,right-left);
                if(prev!=null)
                   prev.next=current;
                break;
            }
            prev=head;
            head=head.next;
            count++;

        }
        if(left!=1){
            return headToReturn;
        }
        return current;
    }

    public ListNode reverse(ListNode head,int right){
        ListNode first=head;
        int count=0;
        ListNode prev=null;
        ListNode nextVal=null;
        while(head!=null&&count<=right){
            nextVal=head.next;
            head.next=prev;
            prev=head;
            head=nextVal;
            count++;
        }
        first.next=nextVal;
        return prev;

    }
}