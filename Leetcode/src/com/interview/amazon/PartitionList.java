package com.interview.amazon;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode partition(ListNode head, int x) {
		ListNode before = new ListNode(0);
		ListNode beforeHead = before;
		ListNode after = new ListNode(0);
		ListNode afterHead = after;
		while (head != null) {
			if (head.val < x) {
				before.next = head;
				before = before.next;
				head = head.next;
			} else {
				after.next = head;
				after = after.next;
				head = head.next;
			}

		}
		before.next = afterHead.next;
		after.next = null;
		return beforeHead.next;
	}

}
