
public class PlusOneLinkedList {

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
    public ListNode plusOne(ListNode head) {
        ListNode returnHead=head;
        ListNode notNine=new ListNode(0);
        notNine.next=head;
        ListNode headToReturn=notNine;
        while(head!=null){
            if(head.val!=9){
                notNine=head;
            }
            head=head.next;

        }
        notNine.val++;
        notNine=notNine.next;
        while(notNine!=null){
            notNine.val=0;
            notNine=notNine.next;
        }
        return headToReturn.val==1?headToReturn:headToReturn.next;
        
    }
}