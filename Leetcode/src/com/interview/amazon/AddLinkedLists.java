package com.interview.amazon;

public class AddLinkedLists {

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
class Solution {
     ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode l4=l3;
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum=carry+l1.val+l2.val;
            carry=sum/10;
            sum=sum%10;

            l3.next=new ListNode(sum);
            l3=l3.next;
            l1=l1.next;
            l2=l2.next;

            }
            while(l1!=null){
                int sum=carry+l1.val;
                carry=sum/10;
                l3.next=new ListNode(sum%10);
                l1=l1.next;
                l3=l3.next;
            }
            while(l2!=null){
                int sum=carry+l2.val;
                carry=sum/10;
                l3.next=new ListNode(sum%10);
                l2=l2.next;
                l3=l3.next;
            }
            if(carry!=0){
                l3.next=new ListNode(carry);
            }
            return l4.next;
        }
    }

