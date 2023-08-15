package com.interview.amazon;

 class ListNode {
	      int val;
	     ListNode next;
	      ListNode()
	      {}
	      ListNode(int val) { this.val = val;
	      }
	      }
	    
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(0);
        ListNode list4=list3;
        if(list1==null&&list2==null){
            return null;
        }
        else if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        else{
            while(list1!=null||list2!=null){
                int val1=list1==null?100:list1.val;
                int val2=list2==null?100:list2.val;
                if(val1<val2){
                    list3.next=new ListNode(val1);
                    list3=list3.next;
                    if(list1!=null)
                       list1=list1.next;
                }
                else{
                
                    list3.next=new ListNode(val2);
                    list3=list3.next;
                    if(list2!=null)
                       list2=list2.next;
                
                }
            }
        }
        return list4.next;
    }

}
