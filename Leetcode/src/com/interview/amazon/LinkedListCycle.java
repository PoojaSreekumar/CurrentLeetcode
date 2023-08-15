package com.interview.amazon;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasCycle(ListNode head) {

		if (head == null) {
			return false;
		}
		ListNode first = head;
		ListNode second = head.next;
		while (first != second) {
			if (second == null || second.next == null) {
				return false;
			}
			first = first.next;
			second = second.next.next;
		}
		return true;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	
	//
	public boolean hasCycle1(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            }
            nodesSeen.add(head);
            head = head.next;
        }
        return false;
    }

}
