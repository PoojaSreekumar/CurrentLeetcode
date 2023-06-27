




public class ReverseLinkedList{
	static Node head;
	static class Node {
		 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	
	Node reverse(Node a) {
		Node prev=null;
		Node current=a;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		
		return prev;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
	private void printList(Node head2) {
		// TODO Auto-generated method stub
		while(head2!=null) {
			System.out.println(head2.data);
			head2=head2.next;
		}
		
	}
}
